package org.example;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Faculty> faculties = new ArrayList<>();

    public void addFaculty(String name) {
        faculties.add(new Faculty(name));
    }

    public void printFaculties() {
        for (Faculty faculty : faculties) {
            System.out.println("Faculty: " + faculty.getName());
            faculty.printDepartments();
        }
    }

    public class Faculty {
        private String name;

        private List<Department> departments = new ArrayList<>();

        public Faculty(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void addDepartment(String name) {
            departments.add(new Department(name));
        }

        public void printDepartments() {
            for (Department department : departments) {
                System.out.println("Department: " + department.getName());
            }
        }

        public class Department {
            private String name;
            private List<String> courses = new ArrayList<>();

            public Department(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public void addCourses(String name) {
                courses.add(name);
            }

            public void printCourses() {
                for (String course : courses) {
                    System.out.println("Course: " + course);
                }
            }
        }
    }
}
