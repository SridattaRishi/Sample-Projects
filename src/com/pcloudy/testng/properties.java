package com.pcloudy.testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class properties {
		
		public static String getcloudName()  {
		Properties prop = new Properties();{

		try {
		    prop.load(new FileInputStream("./config.properties"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
	};
	String cloudName = prop.getProperty("cloudName");
	
	return cloudName;
	
	}
		public static String getuserName()  {
			Properties prop = new Properties();{

			try {
			    prop.load(new FileInputStream("./config.properties"));
			} catch (IOException e) {
			    e.printStackTrace();
			}
		};
		String userName = prop.getProperty("userName");
		
		return userName;
		
		}
		
		public static String getapiKey()  {
			Properties prop = new Properties();{

			try {
			    prop.load(new FileInputStream("./config.properties"));
			} catch (IOException e) {
			    e.printStackTrace();
			}
		};
		String apiKey = prop.getProperty("apiKey");
		
		return apiKey;
		
		}
		public static int getDuration()  {
			Properties prop = new Properties();{

			try {
			    prop.load(new FileInputStream("./config.properties"));
			} catch (IOException e) {
			    e.printStackTrace();
			}
		};
		String Duration = prop.getProperty("Duration");
		int Duration1=Integer.parseInt(Duration);
		
		return Duration1;
		
		}
		public static String App_to_uploaded()  {
			Properties prop = new Properties();{

			try {
			    prop.load(new FileInputStream("./config.properties"));
			} catch (IOException e) {
			    e.printStackTrace();
			}
		};
		String App_to_uploaded = prop.getProperty("App_to_uploaded");
		
		
		return App_to_uploaded;
		
		}
		public static String[] deviceName()  {
			Properties prop = new Properties();{

			try {
			    prop.load(new FileInputStream("./config.properties"));
			} catch (IOException e) {
			    e.printStackTrace();
			}
		};
		String[] deviceName = prop.getProperty("deviceName").split(",");	
		return deviceName;
		
		}
		
		}




