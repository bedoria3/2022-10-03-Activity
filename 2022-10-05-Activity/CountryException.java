public class CountryException extends Exception{
    public CountryException(String message){
        super(message);
    }
    public String outofBound(){
        return "Not in the LOOP";
    }
    public String negativeIndex(){
        return "The Index is not Negative";
    }
}