package com.jokerstation.base.init;

import javax.servlet.ServletContextEvent;

/**
 * 初始化执行对象
 * 用于web服务器启动时执行
 * @author Joker
 *
 */
public class Init extends BaseInit {

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		try{
			super.contextInitialized(arg0);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
