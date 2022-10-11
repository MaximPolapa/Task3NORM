package Laboratorka3.Task1;

public class Seller extends Person {
    private double salary;

    public Seller(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Name Seller=" + getName();
    }
}
