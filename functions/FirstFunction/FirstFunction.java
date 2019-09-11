import com.zoho.cloud.function.Context;
import com.zoho.cloud.function.basic.*;

public class FirstFunction implements ZCFunction {
    public void runner(Context context, BasicIO basicIO) throws Exception {
        basicIO.write("Hello From FirstFunction.java from eclipse");
	}
}