import com.zoho.cloud.function.Context;
import com.zoho.cloud.function.basic.*;
import java.util.Random;

public class FirstFunction implements ZCFunction {
    public void runner(Context context, BasicIO basicIO) throws Exception {
    	
        basicIO.write("Hello From FirstFunction.java from eclipse "+new Random().nextInt(1000));
        
	}
}