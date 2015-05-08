package com.jokerstation.base.util;

import java.util.ResourceBundle;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * redis操作的相关方法
 * @author Joker
 *
 */
public class RedisUtil {
	
	private static JedisPool pool = null;
	private static String password = null;
	private static Integer selectIndex = null;
	
	static {
		ResourceBundle bundle = ResourceBundle.getBundle("redis");
		if (bundle == null) {
			throw new IllegalArgumentException("[usercenter-redis.properties] is not found!");
		}
		JedisPoolConfig config = new JedisPoolConfig();
		config.setMaxIdle(Integer.valueOf(bundle.getString("redis.pool.maxActive")));
		config.setMaxIdle(Integer.valueOf(bundle.getString("redis.pool.maxIdle")));
		config.setMaxWaitMillis(Long.valueOf(bundle.getString("redis.pool.maxWait")));
		config.setTestOnBorrow(Boolean.valueOf(bundle.getString("redis.pool.testOnBorrow")));
		config.setTestOnReturn(Boolean.valueOf(bundle.getString("redis.pool.testOnReturn")));
		
		pool = new JedisPool(config, bundle.getString("redis.ip"), Integer.valueOf(bundle.getString("redis.port")));
		password = bundle.getString("redis.password");
		setSelectIndex(Integer.parseInt(bundle.getString("redis.selectIndex")));
	}

	/**
	 * 获取对象池
	 * 
	 * @return
	 * @throws ConnDBException
	 */
	public static Jedis getResource() throws Exception {
		Jedis jedis = null;
		try {
			jedis = pool.getResource();
			if (null == jedis) {
			}
			jedis.auth(password);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			return getResource();
		}
		return jedis;
	}

	public static void returnResource(Jedis jedis) {
		// 释放对象池
		pool.returnResource(jedis);
	}

	public static void destroyPool() {
		if (null != pool) {
			pool.destroy();
		}
	}

	public static Integer getSelectIndex() {
		return selectIndex;
	}

	public static void setSelectIndex(Integer selectIndex) {
		RedisUtil.selectIndex = selectIndex;
	}
}
