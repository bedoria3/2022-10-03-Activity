public class CountryException extends Exception {

    public CountryException(String message){
        super(message);
    }
    
    public String notNumber(){
        return "Your input is not a number.";
    }

}