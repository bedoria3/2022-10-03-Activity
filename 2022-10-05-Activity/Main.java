import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        List<Siblings> listOfSiblings = new ArrayList<Siblings>();
        
        System.out.println("=======================");
        System.out.println("I am excited to know your siblings!");
        System.out.println("Note: You can only input an integer.");
        System.out.println("=======================");

        try{
            System.out.print("Number of Sibling/s You Have: ");
            Integer objects = input.nextInt();
            
            if(objects < 0){
                input.close();
                scan.close();
                throw new SiblingsException("Your input is negative. Please input positive index.");
            }

            for(int i = 0; i < objects; i++){
                
                System.out.println("");
                System.out.print("Name: ");
                String name_s = scan.nextLine();

                System.out.print("Age: ");
                int age_s = Integer.parseInt(scan.nextLine());
    
                listOfSiblings.add(new Siblings(name_s, age_s));
            }

            System.out.println("");
            System.out.println("Here is your Siblings!");
            System.out.println("=======================");
            for(Siblings list : listOfSiblings){
                System.out.println("Name: " + list.getName() + " || " + "Age: " + list.getAge());    
            }
            System.out.println("=======================");
            System.out.println("");

            input.close();
            scan.close();

        }
        catch(SiblingsException e){
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException ex){
            System.out.println("Your input is not a number.");
        }

    }
}