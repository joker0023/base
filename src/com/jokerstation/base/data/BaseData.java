package com.jokerstation.base.data;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.jokerstation.base.util.MailUtil;
import com.jokerstation.base.util.Utils;

/**
 * 一些静态值
 * @author Joker
 *
 */
public class BaseData {

	public static final String logWroot = Utils.getClassPath() + "log";
	
	//配置文件名
	public static final String dbFileName = "druid.properties";
	
	public static final String distributionFileName = "distribution.properties";
	
	public static final String mailConfFile = "mail.properties";
	
	//邮件发送配置,需要用到这个的话要先调用initMail方法初始化,调用一次就够了
	public static MailUtil mail;
	
	//短信发送配置
	public static String smsAppKey = null;
	
	public static String smsApiUrl = null;
	
	//数据库别名
	public static String alias = null;		
	
	// 编码
	public static String ENCODE = "UTF-8"; 
	
	// HTTP 80 端口
	public static int PORT_HTTP = 80; 
	
	//初始化参数
	static {
		try{
			Properties prop = new Properties();
			InputStream in = BaseData.class.getClassLoader().getResourceAsStream(distributionFileName);
			prop.load(in);
			
			smsAppKey = prop.getProperty("smsAppKey");
			smsApiUrl = prop.getProperty("smsApiUrl");
			alias = prop.getProperty("alias");
			
			in.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 初始化邮件发送
	 * @throws IOException 
	 */
	public static void initMail() throws IOException{
		Properties prop = new Properties();
		InputStream in = BaseData.class.getClassLoader().getResourceAsStream(mailConfFile);
		prop.load(in);
		mail = new MailUtil(prop.getProperty("mailServer"),
				prop.getProperty("from"),
				prop.getProperty("username"),
				prop.getProperty("password"),
				prop.getProperty("nick"));
		
		in.close();
	}
}
