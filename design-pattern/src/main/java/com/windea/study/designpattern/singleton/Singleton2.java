package com.windea.study.designpattern.singleton;

/**
 * 单例模式 饿汉式（静态代码块）
 */
public class Singleton2 {
	private Singleton2() {
	}

	private static final Singleton2 instance;

	static {
		instance = new Singleton2();
	}

	public static Singleton2 getInstance() {
		return instance;
	}
}