package matchtracker;

/**
 *
 * Brendan Waters
 * Oct 3, 2015 12:31:39 AM
 * Brenardo9956@gmail.com
 */
public class Exception extends Throwable{

    String message;
    
    public Exception(String m){
        
        message = m;
        
    }
    
    @Override
    public String getMessage(){
        return message;
    }
    
}
