package models;

public class Person {
    private String name;
    private int Age;

    //Getters y setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int edad) {
        this.Age = edad;
    }

    //Constructor con 2 entradas
    public Person(String name, int age) {
        this.name = name;
        this.Age = age;
    }

    //ToString
    @Override
    public String toString() {
        return "Person [name=" + name + ", edad=" + Age + "]";
    }
}
