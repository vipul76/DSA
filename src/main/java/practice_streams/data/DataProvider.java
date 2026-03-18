package practice_streams.data;

import practice_streams.model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DataProvider {
    public static List<Employee> employees = Arrays.asList(
            new Employee(1, "Vipul", "IT", 70000, 25),
            new Employee(2, "Amit", "HR", 50000, 30),
            new Employee(3, "Neha", "IT", 80000, 28),
            new Employee(4, "Ravi", "Finance", 60000, 35),
            new Employee(5, "Priya", "IT", 90000, 32),
            new Employee(6, "Kiran", "HR", 55000, 27),
            new Employee(7, "Sneha", "Finance", 75000, 29),
            new Employee(8, "Arjun", "IT", 65000, 26),
            new Employee(9, "Rahul", "IT", 72000, 31),
            new Employee(10, "Pooja", "HR", 48000, 24),
            new Employee(11, "Ankit", "Finance", 67000, 33),
            new Employee(12, "Simran", "IT", 88000, 29),
            new Employee(13, "Rohit", "HR", 53000, 28),
            new Employee(14, "Meena", "Finance", 61000, 34),
            new Employee(15, "Suresh", "IT", 92000, 36),
            new Employee(16, "Deepak", "HR", 47000, 26),
            new Employee(17, "Anjali", "IT", 76000, 27),
            new Employee(18, "Nikhil", "Finance", 71000, 32),
            new Employee(19, "Kavita", "HR", 52000, 31),
            new Employee(20, "Varun", "IT", 83000, 30),
            new Employee(21, "Rakesh", "Finance", 69000, 35),
            new Employee(22, "Divya", "IT", 91000, 28),
            new Employee(23, "Gaurav", "HR", 54000, 29),
            new Employee(24, "Tina", "Finance", 72000, 33),
            new Employee(25, "Mohit", "IT", 87000, 34),
            new Employee(26, "Shreya", "HR", 51000, 27),
            new Employee(27, "Ajay", "Finance", 68000, 31),
            new Employee(28, "Ritu", "IT", 79000, 26),
            new Employee(29, "Manish", "HR", 56000, 32),
            new Employee(30, "Alok", "Finance", 74000, 30),
            new Employee(31, "Neeraj", "IT", 86000, 29),
            new Employee(32, "Seema", "HR", 49000, 25),
            new Employee(33, "Kunal", "Finance", 70000, 33),
            new Employee(34, "Pankaj", "IT", 95000, 37),
            new Employee(35, "Nisha", "HR", 53000, 28),
            new Employee(36, "Ramesh", "Finance", 62000, 36),
            new Employee(37, "Payal", "IT", 81000, 27),
            new Employee(38, "Sanjay", "HR", 58000, 34),
            new Employee(39, "Komal", "Finance", 73000, 31),
            new Employee(40, "Tarun", "IT", 84000, 28),
            new Employee(41, "Bhavna", "HR", 52000, 29),
            new Employee(42, "Vikas", "Finance", 76000, 35),
            new Employee(43, "Isha", "IT", 89000, 30),
            new Employee(51, "Prajakta", "HR", 93000, 38),
            new Employee(44, "Harsh", "HR", 50000, 26),
            new Employee(45, "Yogesh", "Finance", 71000, 32),
            new Employee(46, "Priti", "IT", 93000, 33),
            new Employee(47, "Nitin", "HR", 55000, 31),
            new Employee(48, "Asha", "Finance", 68000, 30),
            new Employee(49, "Rajat", "IT", 82000, 29),
            new Employee(50, "Sonal", "HR", 54000, 28)

    );

    public static List<String> words = Arrays.asList(
            "apple", "banana", "apple", "orange", "banana", "grape",
            "kiwi", "apple", "orange", "banana", "melon", "kiwi",
            "grape", "apple", "banana", "cherry", "melon", "kiwi"
    );

    public static List<Integer> numbers = Arrays.asList(
            10, 25, 30, 45, 50, 60, 75, 80, 90, 100,
            5, 15, 20, 35, 40, 55, 65, 70, 85, 95
    );

    public static Map<String, List<Employee>> departmentMap = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment));
}
