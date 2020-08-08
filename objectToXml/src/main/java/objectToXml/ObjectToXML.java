package objectToXml;

import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class ObjectToXML {

	

	public static void main(String[] args) throws Exception {
		
		JAXBContext contextObj = JAXBContext.newInstance(Student.class);
		Marshaller marshallerObj = contextObj.createMarshaller();
		marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		
		Student s1 = new Student(100, "Shree", 95);
		
		marshallerObj.marshal(s1,new FileOutputStream("Student.xml"));
		System.out.println("Converted JAVA to XML Successfully.........");
		
		
				

	}

}
