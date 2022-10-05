import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String myDream_Country[] = {"Korea", "France", "Japan", "America", "Australia"};
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the index of the favorite Sport you want to display: ");
        int choice = Scan.nextInt();
        try{
            if(choice < 0){
                Scan.close();
                throw new CountryException("The Index is negative!");
            }if(choice > 5){
                Scan.close();
                throw new CountryException("The index "+ choice +" is not valid!");
            }
            System.out.println(myDream_Country[choice]);
        }catch(CountryException e){
            System.out.println(e.getMessage());
        }
        Scan.close();
    }
}

