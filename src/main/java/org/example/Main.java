package org.example;

public class Main {
    public static void main(String[] args) {
        University university = new University();
        University.Faculty faculty = university.new Faculty("Business Administrator");
        faculty.addDepartment("Marketing");
        University.Faculty.Department department = faculty.new Department("Business Administrator");
        department.addCourses("Business Analytic");
        university.addFaculty(faculty.getName());
        university.printFaculties();
        faculty.printDepartments();
        department.printCourses();
    }
    //I did read theory of SOLID
}