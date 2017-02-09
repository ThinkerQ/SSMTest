package com.pingan.groupinsure.base.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class GetConnListener implements ServletContextListener {

	/**
	 * 服务器启动时调用
	 */
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("---服务器已经启动----");
	}

	/**
	 * 服务器关闭时调用
	 */
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("---服务器已经关闭----");
	}

}
