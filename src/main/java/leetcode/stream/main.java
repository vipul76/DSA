package leetcode.stream;

import leetcode.stream.implementation.EmpStreamImpl;
import leetcode.stream.implementation.NumberStreamImpl;

import java.util.Arrays;
import java.util.List;

public class main {
    static void main() {

        List<Employee> empList = Arrays.asList(
                new Employee(1,"John Doe",30, "male",50000),
                new Employee(2,"James Smith", 25,"female",20000),
                new Employee(3,"Mike Johnson",40,"male",70000),
                new Employee(4,"Emily Davis",50,"male",80000),
                new Employee(5, "Robert Brown", 50, "male",90000)
        );

        List<Integer> numbers = Arrays.asList(2,3,3,5,6,8,22,22,23,25,27,28,29,29,30);

        EmpStreamImpl impl = new EmpStreamImpl();
        impl.findMaleAndFemaleEmployee(empList);
        impl.avgEmpSalary(empList);

        Employee secondHighestSalaryEmployee = impl.secondHighestSalary(empList);
        System.out.println(secondHighestSalaryEmployee);

        Employee highestSalaryEmployee = impl.highestSalary(empList);
        System.out.println(highestSalaryEmployee);

        NumberStreamImpl numberImpl = new NumberStreamImpl();
        numberImpl.oddAndEvenGroup(numbers);
        numberImpl.oddAndEvenSum(numbers);
        numberImpl.duplicateElement(numbers);
    }
}
