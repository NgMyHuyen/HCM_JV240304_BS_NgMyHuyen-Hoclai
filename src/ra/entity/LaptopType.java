package ra.entity;
import java.util.Date;
import java.util.Scanner;

public class LaptopType {
private int typeId;
    public static int nextId = 1;
    private String typeName, descriptionsType;
    private boolean isDeleted;

    public LaptopType(String typeName, String description) {
        typeId= nextId++;
        this.typeName = typeName;
        this.descriptionsType = description;
    }
//    private Object description;


    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }


    public String getDescriptionType() {
        return descriptionsType;
    }

    public boolean getIsDeleted() {
        return isDeleted;
    }

    public void setTypeName(StringBuilder bookName) {
        this.typeName = typeName;
    }



    public void setDescriptions(String descriptionsType) {
        this.descriptionsType = descriptionsType;
    }

    public void setIsDeleted(boolean bookStatus) {
        this.isDeleted = isDeleted;
    }




    public static LaptopType inputData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Type Name: ");
        String typeName = sc.nextLine();

        System.out.print("Enter Description: ");
        String description = sc.nextLine();

        return new LaptopType(typeName, description);
    }

    public void updateData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Type Name: ");
        this.typeName = sc.nextLine();

        System.out.print("Enter Description: ");
        this.descriptionsType = sc.nextLine();
    }

    public void displayData() {
        System.out.printf("Type ID: %s%n |Type Name: %s%n |Description: %s%n", this.typeId, this.typeName, this.descriptionsType);

    }
}



