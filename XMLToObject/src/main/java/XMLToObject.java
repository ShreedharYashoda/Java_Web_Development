import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XMLToObject {

	public static void main(String[] args) {
		
		try {
			File f = new File("Student.xml");
			JAXBContext contextObj = JAXBContext.newInstance(Student.class);
			Unmarshaller jaxUnmashaller = contextObj.createUnmarshaller();
			Student s1 = (Student) jaxUnmashaller.unmarshal(f);
			System.out.println(s1.getSid()+"\t"+s1.getSname()+"\t"+s1.getMarks());
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
