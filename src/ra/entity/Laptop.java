package ra.entity;
//package src.ra.bussiness;

import java.util.Date;
import java.util.Scanner;

public class Laptop {
    private String laptopId, laptopName, description;
    private static int ram;
    private Date createAt;
    private double laptopPrice, weight;
    public boolean isDeleted;
    public LaptopType typeId;
    private String descriptions;

    public Laptop(){}
    public Laptop(String laptopId, String laptopName, String description, int ram, double laptopPrice, double weight, int typeId) {
        this.laptopId = laptopId;
        this.laptopName = laptopName;
        this.description = description;
        this.ram = ram;
        this.laptopPrice = laptopPrice;
        this.weight = weight;
//        this.typeId = typeId;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        Laptop.ram = ram;
    }

    public String getLaptopId() {
        return new String(laptopId);
    }

    public void setLaptopId(String laptopId) {
         this.laptopId = laptopId;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public  void inputData(){
        System.out.println("Laptop ID: " + laptopId);
        System.out.println("Laptop Name: " + laptopName);
        System.out.println("Descriptions: " + description);
        System.out.println("Laptop ram: " + ram);

        System.out.println("Laptop weight: " + weight);

        System.out.println("Laptop date: " + createAt);

        System.out.println("Laptop price: " + laptopPrice);

        System.out.println("Laptop type: " + typeId);


    }

}

