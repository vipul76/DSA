package practice_streams.stream;

import practice_streams.data.DataProvider;
import practice_streams.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeStream {
    static void main() {

        List<Employee> employeeList = DataProvider.employees;
        List<String> wordList = DataProvider.words;
        List<Integer> numberList = DataProvider.numbers;
        Map<String,List<Employee>> departmentMapList = DataProvider.departmentMap;

        //1)Get all employee names
            System.out.println("1)Get all employee names");
            System.out.print("  Way 1: Printing names : ");
            employeeList.forEach(t->System.out.print(t.getName()+","));
            System.out.println();
            System.out.print("  Way 2: Printing names : ");

            List<String> employeeName = employeeList.stream().map(Employee::getName).toList();
            employeeName.forEach(name-> System.out.print(name+","));
            System.out.println();
            System.out.println("======================");

        //2)Count employees in each department
            System.out.println("2)Count employees in each department");
            Map<String,Long> employeeCount = employeeList.stream()
                    .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
            employeeCount.forEach((dept,count)-> System.out.println("   Department : "+dept+" | "+"Count : "+ count));
            System.out.println("======================");

        //3)Find average salary per department
            System.out.println("3)Avg Salary according to department");
            Map<String,Double> avgSalaryByDept = employeeList.stream()
                    .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
            avgSalaryByDept.forEach((dept,avgSal) -> System.out.println("   Department: "+dept+" | "+"Avg Sal : "+avgSal));
            System.out.println("======================");
        //4)Find highest paid employee
            System.out.println("4)Highest Paid employee");
            Employee emp = employeeList.stream()
                    .max(Comparator.comparing(Employee::getSalary))
                    .orElse(null);
            System.out.println("    "+emp);
            System.out.println("======================");
        //5)Second Highest paid employee
        // We cannot use max() because it returns only the highest element.
        // To find second highest, we need ordering.
        // So we sort in descending order, skip the first (highest), and pick next.
            System.out.println("5) way 1: Highest Paid employee");
            Employee emp1 = employeeList.stream()
                    .sorted(Comparator.comparing(Employee::getSalary).reversed())
                    .skip(1)
                    .findFirst()
                    .orElse(null);

            System.out.println(emp1);

            System.out.println("5) way 2: Highest Paid employee for removing the duplicates");
            Employee emp3 = employeeList.stream()
                    .map(Employee::getSalary)
                    .distinct()
                    .sorted(Comparator.reverseOrder())
                    .skip(1)
                    .findFirst()
                    .flatMap(sal-> employeeList
                            .stream()
                            .filter(e->e.getSalary()==sal)
                            .findFirst())
                    .orElse(null);
            System.out.println(emp3);
            System.out.println("======================");

            //6)Find total salary expense of company
            System.out.println("5) Find total salary expense of company");
            double companyExpense = employeeList.stream()
                    .mapToDouble(Employee::getSalary)
                    .sum();
            System.out.println("Total Expense to company : "+ companyExpense);
            System.out.println("======================");

            //7) Find total salary expense based on department wise in company
            System.out.println("5) Find total salary expense based on department wise in company");
            Map<String,Double> companyDeptExp = employeeList
                    .stream()
                    .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingDouble(Employee::getSalary)));
            companyDeptExp.forEach((Dept,sum)-> System.out.println("Department : "+ Dept + " | "+"Expenses : "+ sum));
            System.out.println("======================");
    }
}
