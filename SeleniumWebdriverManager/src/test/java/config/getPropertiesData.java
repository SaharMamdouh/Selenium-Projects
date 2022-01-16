package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import Test.testng_demo;

public class getPropertiesData {
	static Properties prop = new Properties();
	static String projectPath=System.getProperty("user.dir");

	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();
	}
	
	public static void getProperties() {
		
		try {
			
			System.out.println(projectPath);
			InputStream input = new FileInputStream(projectPath+"\\src\\test\\java\\config\\config.properties");
			//load properties file
			try {
				prop.load(input);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//get the values from the file
			String browser=prop.getProperty("browser");
			System.out.println(browser);
			testng_demo.BrowserName=prop.getProperty("browser");
			
		} catch (FileNotFoundException e) {
	        System.out.println("message is :" + e.getMessage());
	        System.out.println("cause is :" + e.getCause());
		
			e.printStackTrace();
		}
	}
		
		public static void setProperties() {
			try {
				OutputStream output = new FileOutputStream(projectPath+"\\src\\test\\java\\config\\config.properties");
				prop.setProperty("Result","pass");
				prop.store(output, null);
				
			}catch(Exception e){
				System.out.println("message is :" + e.getMessage());
		        System.out.println("cause is :" + e.getCause());
			
				e.printStackTrace();
			}
			
		}
			
		}
	


