import java.util.*;

class Vehicle {
    String vehicle_type;
    double price;

    Vehicle(String vehicle_type, double price) {
        System.out.println("Vehicle class application : ");
        this.vehicle_type = vehicle_type;
        this.price = price;
    }

    void display() {
        System.out.println("Vehicle Type  : " + vehicle_type);
        System.out.println("Vehicle Price : " + price);
    }
}

class Fruit {
    String fruit_type;
    double price;

    Fruit(String fruit_type, double price) {
        System.out.println("Fruit class application   : ");
        this.fruit_type = fruit_type;
        this.price = price;
    }

    void display() {
        System.out.println("Vehicle Type  : " + fruit_type);
        System.out.println("Vehicle Price : " + price);
    }
}

class Student {
    String name;
    int roll_no;

    Student(String name, int roll_no) {
        System.out.println("Student class application : ");
        this.name = name;
        this.roll_no = roll_no;
    }

    void display() {
        System.out.println("Student Name  : " + name);
        System.out.println("Stuent RollNo : " + roll_no);
    }

}

public class cc1 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Car",20000);
        v.display();

        Fruit f = new Fruit("Mango",20);
        f.display();

        Student s = new Student("Shivang",3055);
        s.display();
    }
}

/*
Vehicle class application : 
Vehicle Type  : Car
Vehicle Price : 20000.0
Fruit class application   :
Vehicle Type  : Mango
Vehicle Price : 20.0
Student class application :
Student Name  : Shivang
Stuent RollNo : 3055
*/