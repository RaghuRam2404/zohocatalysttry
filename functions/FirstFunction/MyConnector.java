import java.io.InputStream;

import org.apache.http.client.methods.HttpPost;

import com.zoho.cloud.connector.Connector;
import com.zoho.cloud.connector.ConnectorResponse;

//$Id$

public class MyConnector implements Connector {

	@Override
	public ConnectorResponse doGet(String paramString) throws Exception {
		
		return null;
	}

	@Override
	public ConnectorResponse doPost(String url, Object params) throws Exception {
		HttpPost hp = null;
		return null;
	}

	@Override
	public ConnectorResponse doPut(String paramString, InputStream paramInputStream) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
