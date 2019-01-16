package seleniumstart;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesCheck {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		Properties prop=new Properties();
		
//		For reading from a property file the following things are required :
//			1. Property File (which shall house the key value pair which are required to be saved as a different file to enhance maintainability)
//			As a part of this Properties class will be required which is a part of java.util package [ Done above ] 
//			2. FileInputStream will be required to read from a file and input to a file [ Done below ]
		
			FileInputStream ip=new FileInputStream("/Users/saksham.bahati/git/SeleniumAutomationFramework/SeleniumAutomations/src/main/java/seleniumstart/config.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("news"));	
		
	}

}
