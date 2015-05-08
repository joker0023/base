package com.jokerstation.base.init;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.LogManager;

import com.jokerstation.base.data.BaseData;
import com.jokerstation.base.util.Utils;

/**
 * 被继承的ServletContextListener实现类
 * 主要实现了: 
 * 配置log4j的文件输出设置
 * 初始化邮件发送
 * @author Joker
 *
 */
public class BaseInit implements ServletContextListener {

	private static String logRoot = "logRoot";
	
	static {
		// 初始化系统，配置log4j的log文件输出位置
		String logWroot = BaseData.logWroot;
		System.setProperty(logRoot, logWroot);
		System.out.println(": success to set the system property. key=" + logRoot + ", value=" + logWroot);
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.print(Utils.getCurrentLineMessage(new Exception()));
		System.out.println(":clean SystemValue Completely,key=" + logRoot + ", value=" + System.getProperty(logRoot));
		System.clearProperty(logRoot);
		LogManager.shutdown();
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		try{
			//初始化邮件发送
			BaseData.initMail();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 內部類，讀取property
	 */
	static class PropertyLoader {

		private Properties property = new Properties();

		public void initialize(String initFile) {
			try {
				InputStream in = PropertyLoader.class.getClassLoader().getResourceAsStream(initFile);
				property.load(in);
				System.out.println("%====success to init the properties file =====%");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("%====fail to init the properties file=====%");
			}
		}

		public String getParameter(String param) {
			return property.getProperty(param);
		}
	}

}
