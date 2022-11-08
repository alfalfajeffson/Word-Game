/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ks
 */
import java.util.Scanner;
public class Storywordgame {
    public static void main(String[]args){
        Scanner foods = new Scanner(System.in);
        
        //DECLARATIONS
        String name;
        String age;
        String profession;
        String animal;
        String college;
        String city;
        String petName;
        
        //INPUTING DECLARATION:
        //NAME
        System.out.println("Enter your name");
        name = foods.nextLine();
        
        //AGE
        System.out.println("Enter your age");
        age = foods.nextLine();
        
        //CITY
        System.out.println("Enter the name of your city");
        city = foods.nextLine();
        
        //COLLEGE
        System.out.println("Enter the name of the college you attended");
        college = foods.nextLine();
        
        //PROFESSION
        System.out.println("Enter your profession");
        profession = foods.nextLine();
        
        //FAVOURITE ANIMAL
        System.out.println("Enter the name of your favourite animal");
        animal = foods.nextLine();
        
        //NICKNAME
        System.out.println("Enter your petname");
        petName = foods.nextLine();
        
        //COMBINATION OF RESULTS TO FORM STORY
        System.out.println("There once was person named " + name + " who lived in " + city + "." + " At the age of " + age + ", " + name + " went to college at " + college + ". " + name + " graduated and went to work as a " + profession + "." + " Then, " + name + " adopted a(n) " + animal + " named " + petName + "." + " They both lived happily, ever after in WONDERLAND!");
        
    }
    
}
