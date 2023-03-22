package org.example;

import java.util.Comparator;

public class Person implements Comparator<Person>, Comparable<Person> {
    private String name;
    private Integer age;
    private String cpf;

    public Person(String name, Integer age, String cpf) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compare(Person p1, Person p2) {
        return p1.age - p2.age;
    }

    @Override
    public int compareTo(Person o) {
        return this.cpf.compareTo(o.cpf);
    }
}
