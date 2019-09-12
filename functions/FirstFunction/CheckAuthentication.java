//$Id$
import java.util.Random;

import com.zoho.cloud.connector.Connector;
import com.zoho.cloud.function.Context;
import com.zoho.cloud.function.basic.*;


public class CheckAuthentication implements ZCFunction  {
	
	@Override
	public void runner(Context context, BasicIO io) throws Exception {
		String code = (String) io.getParameter("code");
		io.write("Hello From CheckAuthenctication.java from eclipse");
	}

}
