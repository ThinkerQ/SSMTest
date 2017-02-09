package com.pingan.groupinsure.base.web.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
/**
 * @author King
 * ServletContextAttributeListener用于监听ServletContext(application)范围内属性的变化，需要实现三个方法
 */
public class MyServletContextAttributeListener implements ServletContextAttributeListener {

	/**
	 * 当程序把一个属性存入application范围时出发该方法
	 */
	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
		ServletContext application = event.getServletContext();
		//获取添加的属性名和属性值
		String name = event.getName();
		Object value = event.getValue();
		System.out.println(application+"范围内添加了名为"+name+",值为"+value+"的属性。");
	}

	/**
	 * 当程序把一个属性从application范围移除时触发该方法
	 */
	@Override
	public void attributeRemoved(ServletContextAttributeEvent event) {
		ServletContext application = event.getServletContext();
		//获取添加的属性名和属性值
		String name = event.getName();
		Object value = event.getValue();
		System.out.println(application+"范围内移除了名为"+name+",值为"+value+"的属性。");
	}
	
	/**
	 * 替换时发生
	 */
	@Override
	public void attributeReplaced(ServletContextAttributeEvent event) {
		ServletContext application = event.getServletContext();
		//获取添加的属性名和属性值
		String name = event.getName();
		Object value = event.getValue();
		System.out.println(application+"范围内名为"+name+",值为"+value+"的属性被移除了。");
	}

}
