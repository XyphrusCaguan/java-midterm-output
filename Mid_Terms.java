package javaapplication.Activity1;

import java.util.ArrayList;
import java.util.Scanner;

public class Mid_Terms {

    public static ArrayList<Integer> ages = new ArrayList<Integer>();
    public static ArrayList<String> names = new ArrayList<String>();

    public static void UpdateEntry(){
        Scanner uPd = new Scanner(System.in);
        Scanner newaGe = new Scanner(System.in);
        Scanner newnAme = new Scanner(System.in);
        System.out.println("===== Update Entry =====");
        System.out.print("Enter name you want to update: ");
        String upd = uPd.nextLine();
        int i;
        boolean nameFound = false;
        for(i = 0; i < names.size(); i++){
            if(names.get(i) == null ? upd == null : names.get(i).equals(upd)){
                nameFound = true;
                break;
            }
        }
        if(nameFound){
            System.out.print("Enter new name: ");
            String newName = newnAme.nextLine();
            names.set(i, newName);
            System.out.print("\nEnter new age: ");
            int newAge = newaGe.nextInt();
            ages.set(i, newAge);
        }
        else{
            System.out.println("No " + upd + " is in the list");
        }
        menu();
    }
    public static void ViewEntry(){
        int i, j;
        for(i = 0; i < names.size(); i++){
            System.out.println(names.get(i) + "\tis\t" + ages.get(i));
        }
        
        menu();
    }
    public static void DelEntry(){
        Scanner dEl = new Scanner(System.in);
        System.out.println("===== Delete Entry =====");
        System.out.print("Enter name to delete: ");
        String del = dEl.nextLine();
        int i;
        boolean nameFound = false;
        for(i = 0; i < names.size(); i++){
            if(names.get(i) == null ? del == null : names.get(i).equals(del)){
                nameFound = true;
                break;
            }
        }
        if(nameFound){
            names.remove(del);
            ages.remove(i);
            System.out.println(del + " has been deleted!");
        }
        else{
            System.out.println("No " + del + " is in the list");
        }
        menu();
    }
    public static void AddEntry(){
        
        Scanner nAme = new Scanner(System.in);
        Scanner aGe = new Scanner(System.in);
        System.out.println("===== Add Entry =====");
        System.out.print("Enter Name: ");
        String name = nAme.nextLine();
        names.add(name);
        System.out.print("\nEnter Age: ");
        int age = aGe.nextInt();
        ages.add(age);
        menu();
    }
    public static void menu(){
        
        Scanner option = new Scanner(System.in);
        System.out.println("===== Options =====");
        System.out.println("1. Add Entry");
        System.out.println("2. Delete Entry");
        System.out.println("3. View All Entries");
        System.out.println("4. Update An Entry");
        System.out.println("0. Exit");
        
        System.out.print("Select an Option: ");
        int opt = option.nextInt();
        switch(opt){
            case 1:
                AddEntry();
                break;
            case 2:
                DelEntry();
                break;
            case 3:
                ViewEntry();
                break;
            case 4:
                UpdateEntry();
                break;
            case 0:
                break;
        }
    }
    public static void main(String[] args){
        names.add("Anna");
        ages.add(18);
        names.add("Victoria");
        ages.add(20);
        System.out.println("Midterm Program");
        menu();
    }
}
