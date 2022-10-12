public class SiblingsException extends Exception {

    public SiblingsException(String message){
        super(message);
    }
    
    public String notNumber(){
        return "Your input is not a number.";
    }

}