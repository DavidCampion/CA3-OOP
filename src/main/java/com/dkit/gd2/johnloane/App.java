package com.dkit.gd2.johnloane;

import java.util.*;

/**
 * OOP CA3
 * @author John Loane
 */
public class App 
{
    public static void main( String[] args )
    {
        //Question 1
        ArrayList<Student> list = new ArrayList<>();
        questionOnePartA(list);
        questionOnePartB(list);
        questionOnePartC(list);
        //questionOnePartD;
        System.out.println("questionOnePartD: ArrayList has O(n) time complexity for arbitrary indices of add/remove, but O(1) for the operation at the end of the list. \n");


        //Question 2
        // Two Part A - ArrayList
        ArrayList<Employee> employees = new ArrayList<>();
        questionTwoPartA(employees);
        // Two Part B - HashMap
        questionTwoPartB(employees);
        // Two Part C - HashMap
        questionTwoPartC(employees);
        //questionTwoPartD();

        //Question 3
        List<String> oneHundredStrings = new ArrayList<>();
        populateOneHundredStrings(oneHundredStrings);
        questionThreePartA(oneHundredStrings);
        //questionThreePartB();
        System.out.println("O(n) - Complexity of my solution");

        //Question 4
        compareTwoStudents();
        //questionFourPartA();
        //questionFourPartB();
        //questionFourPartC();
    }

    public static void questionOnePartA(ArrayList<Student> list) {
        // ArrayList of Students
        list.add(new Student(2, "Jason",19));
        list.add(new Student(6,"Stephen", 18));
        list.add(new Student(4,"Sarah",20));
        list.add(new Student(1,"Daniel",18));

    }

    public static void questionOnePartB(ArrayList<Student> list) {
        System.out.println("\nQuestion 1 Part B");
        System.out.println("Sort By Name");
        Collections.sort(list, new NameComparator(SortType.Ascending));
        displayStudents(list);

    }

    public static void questionOnePartC(ArrayList<Student> list) {
        System.out.println("\nQuestion 1 Part C");
        System.out.println("Sort By Age");
        Collections.sort(list, new AgeComparator(SortType.Ascending));
        displayStudents(list);

    }

    public static void displayStudents(ArrayList<Student> list) {
        System.out.println("---------------------------------------");
        System.out.printf("%-10s%-20s%-20s\n", "ID: ", "Name: ", "Age:");
        for(Student g : list)
        {
            System.out.printf("%-10s%-20s%-20s\n", g.getId(), g.getName(), g.getAge());
        }
        System.out.println("---------------------------------------");
    }

    public static void questionTwoPartA(ArrayList<Employee> employees) {
        employees.add(new Employee("Dennis","Stephens"));
        employees.add(new Employee("Kaylee","Morris"));
        employees.add(new Employee("Kaylee","Morris"));
        employees.add(new Employee("Daniel","James"));
        employees.add(new Employee("Mac","MacDonald"));
        employees.add(new Employee("Charlie","Day"));
        employees.add(new Employee("Charlie","Space"));

        pickLuckyWinner(employees);
    }

    public static void pickLuckyWinner(ArrayList<Employee> employees){
        Random generator = new Random();
        int randomIndex = generator.nextInt(employees.size());
        System.out.println("\nQuestion 2 Part A");
        System.out.println("The Lucky Winner is...");
        System.out.printf(employees.get(randomIndex).getFirstName() + " " + employees.get(randomIndex).getLastName());
        System.out.println();
    }

    public static void questionTwoPartB(ArrayList<Employee> employees) {
        Map<String, Integer> uniqueNames = new HashMap<>();

        for(int i =0; i < employees.size();i++){
            if(employees.get(i).equals(uniqueNames)) {

            } else {
                uniqueNames.put(employees.get(i).getFirstName(),(i));
            }
        }
        System.out.println();
        System.out.println("\nQuestion 2 Part B");
        System.out.println(uniqueNames);
    }

    public static void questionTwoPartC(ArrayList<Employee> employees) {
        Map<String, Integer> nameAndCount = new HashMap<>();

        for(Employee name : employees) {
            Integer count = nameAndCount.get(name.getFirstName());
            if (count != null) {
                nameAndCount.put(name.getFirstName(),(count+1));

            } else {
                nameAndCount.put(name.getFirstName(), 1); // add new word with count 1
            }
        }

        System.out.println();
        System.out.println("\nQuestion 2 Part C");
        System.out.println(nameAndCount);
    }

    //The method below relates to Question 4
    private static void compareTwoStudents()
    {
        Student alex1 = new Student(1, "Alex", 22);
        Student alex2 = new Student(1, "Alex", 22);
        System.out.println("alex1 hashcode = " + alex1.hashCode());
        System.out.println("alex2 hashcode = " + alex2.hashCode());
        System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));
    }

    //This is just a helper method to populate the list of strings for question 3. You do not need to read it to answer any of the questions in the CA
    private static void populateOneHundredStrings(List<String> oneHundredStrings)
    {
        for(int i=0; i < 100; i++)
        {
            if(i / 10 == 0)
            {
                oneHundredStrings.add("Java");
            }
            else if(i / 10 == 1)
            {
                oneHundredStrings.add("Python");
            }
            else if(i / 10 == 2)
            {
                oneHundredStrings.add("C++");
            }
            else if(i / 10 == 3)
            {
                oneHundredStrings.add("Javascript");
            }
            else if(i / 10 == 4)
            {
                oneHundredStrings.add("Ruby");
            }
            else if(i / 10 == 5)
            {
                oneHundredStrings.add("Golang");
            }
            else if(i / 10 == 6)
            {
                oneHundredStrings.add("C#");
            }
            else if(i / 10 == 7)
            {
                oneHundredStrings.add("C");
            }
            else if(i / 10 == 8)
            {
                oneHundredStrings.add("R");
            }
            else if(i / 10 == 9)
            {
                oneHundredStrings.add("Swift");
            }
        }
    }

    public static void questionThreePartA(List<String> oneHundredStrings) {
        List<String> oneHundredStringsReduced = new ArrayList<>();
        for(int i =0; i < oneHundredStrings.size();i++){
            if(oneHundredStringsReduced.contains(oneHundredStrings.get(i))) {

            } else {
                oneHundredStringsReduced.add(oneHundredStrings.get(i));
            }
        }
        System.out.println();
        System.out.println("\nQuestion 3 Part A");
        System.out.println(oneHundredStringsReduced);
    }
}
