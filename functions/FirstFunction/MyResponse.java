import java.io.InputStream;

import com.zoho.cloud.connector.ConnectorResponse;

//$Id$

public class MyResponse implements ConnectorResponse {

	public MyResponse(){
		
	}
	
	@Override
	public int getResponseCode() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public InputStream getInputStream() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InputStream getErrorStream() {
		// TODO Auto-generated method stub
		return null;
	}

}
