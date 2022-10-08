import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        List<Country> listOfCountry = new ArrayList<Country>();

        System.out.println("=====================================");
        System.out.println("Welcome to DreamLand!");
        System.out.println("=====================================");
        System.out.println("Note: You can only input an integer.");
        System.out.println("=====================================");
        
        try{
            System.out.print("Number of Country you want to visit: ");
            int objects  = sc.nextInt();
            
            if(objects < 0){
                input.close();
                sc.close();
               
            }

            for(int i = 0; i < objects; i++){
                
                System.out.println("");
                System.out.println("Dream Country: ");
                String countryname = input.nextLine();
    

                listOfCountry.add(new Country(countryname));
            }

            System.out.println("");
            System.out.println("Here's Your Dream Country List!");
            System.out.println("=====================================");
            for(Country list : listOfCountry){
                System.out.println(list.getCountry());    
            }
            System.out.println("=====================================");
            System.out.println("");

            input.close();
            sc.close();
             throw new CountryException("");
            
             
        }catch(CountryException e){
            System.out.println(e.getMessage());
        }

    }
}
