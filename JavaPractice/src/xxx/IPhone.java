package xxx;

import java.io.IOException;

public class IPhone extends SmartPhone {
	
	public void sendSMS() throws IOException {//不能放更高階的Exception
		System.out.println("很潮的發送簡訊");
	}

}
