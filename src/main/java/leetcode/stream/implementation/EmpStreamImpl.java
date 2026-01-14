package leetcode.stream.implementation;

import leetcode.stream.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpStreamImpl {

    public void findMaleAndFemaleEmployee(List<Employee> employeeList){
        Map<String, Long> genderCount = employeeList
                .stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        printMap("Count employee based on gender",genderCount);
    }

    public void avgEmpSalary(List<Employee> employeeList){
        Map<String, Double> avgSalary = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.averagingDouble(Employee::getSalary)));
        printMapDouble("Avg Salary based on gender", avgSalary);
    }

    public Employee secondHighestSalary(List<Employee> employeeList){
        System.out.print("Second Highest salary of employee : ");
        return employeeList.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .orElse(null);

    }

    public Employee highestSalary(List<Employee> employeeList){
        return employeeList.stream()
                .max(Comparator.comparingLong(Employee::getSalary))
                .orElse(null);
    }


    private void printMap(String type , Map<String, Long> genderCount) {
        System.out.println(type);
        genderCount.entrySet().stream()
                .forEach(entry ->
                        System.out.println(entry.getKey()+ " : "+entry.getValue()));
        System.out.println();
    }
    private void printMapDouble(String type , Map<String, Double> genderCount) {
        System.out.println(type);
        genderCount.entrySet().stream()
                .forEach(entry ->
                        System.out.println(entry.getKey()+ " : "+entry.getValue()));
        System.out.println();
    }
}
