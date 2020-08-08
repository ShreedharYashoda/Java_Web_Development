import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.shree.ws.Hello;

public class Client {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:81/ws/hello?wsdl");
		QName qname = new QName("http://ws.shree.com/", "HelloImplService");
		Service service = Service.create(url, qname);
		Hello hello = service.getPort(Hello.class);
		System.out.println(hello.sayHello("Stuti"));

	}

}
