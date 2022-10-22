package com.components.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	public static Properties prop = null;

	public ReadConfig() {
		try {
			FileInputStream file = new FileInputStream(
					new File("D:\\project\\components\\src\\main\\java\\com\\components\\config\\config.properties"));
			prop = new Properties();
			prop.load(file);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getBaseUrl() {
		return prop.getProperty("baseUrl");
	}

	public String getBrowser() {
		return prop.getProperty("browser");
	}

	public String getBaseUr() {
		return prop.getProperty("baseUrl");
	}

	public String getBaseUl() {
		return prop.getProperty("baseUrl");
	}

	public String getTimeout() {
		return prop.getProperty("timeout");
	}

	public String getWebdriverTimeout() {
		return prop.getProperty("webdriverTimeout");
	}

	public static void main(String[] args) {

		ReadConfig config = new ReadConfig();

	}

	public CharSequence getTextArea() {

		return prop.getProperty("textArea");
	}

	public CharSequence getquantity() {
		// TODO Auto-generated method stub
		return prop.getProperty("quantity");
	}

	public String getUploadFileErr()

	{
		return prop.getProperty("uploadFileErr");
	}

}
