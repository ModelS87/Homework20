package pro.sky.skyprospringdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {
        @JsonProperty("firstName")
    private final String name;
       @JsonProperty("lastName")
        private final String surname;


        public Employee(String name,
                        String surname) {
            this.name = name;
            this.surname = surname;
        }

        public String getName() {
            return this.name;
        }

        public String getSurname() {
            return this.surname;
        }

        @Override
        public boolean equals (Object o) {
            if (this == o) {
                return true;
        }
            if (o == null || getClass() != o.getClass()){
                return false;
            }
            Employee employee = (Employee)  o;
            return name.equals(employee.name) && surname.equals(employee.surname);
        }
        @Override
    public String toString(){
            return String.format("Ф.И.: %s %s",surname,name);
        }
    }

