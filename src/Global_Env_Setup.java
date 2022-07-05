import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

/*
 * Create the document.proprties file to store and fetch all the data related to global env such as browser or, url setup
 */
public class Global_Env_Setup {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        
		// To create the Proprerties calss 
		Properties pro = new Properties();
		
		//To give the Properties of the file
		FileInputStream fis = new FileInputStream("E:\\Software\\Eclipse\\workspace\\SeleniumFour_Test_NG\\src\\Document.Properties");
		
		//To load the data of the properties file.
		pro.load(fis);
		
		//To print the Properties
		System.out.println(pro.getProperty("browser"));
		System.out.println(pro.getProperty("url"));
		
		//To change the properties of the browser
		pro.setProperty("browser" ,"Firefox");
		System.out.println(pro.getProperty("browser"));
		
		//To store the changed properties to the document file.
		FileOutputStream fos = new FileOutputStream("E:\\Software\\Eclipse\\workspace\\SeleniumFour_Test_NG\\src\\Document.Properties");
		pro.store(fos, null);
	}

}
