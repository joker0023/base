package com.jokerstation.base.util;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import redis.clients.jedis.Jedis;

/**
 * redis的基本api,其实就是把redis的命令都封了一层
 * @author Administrator
 *
 */
public class RedisAPI {
	
	private final static Logger logger = Logger.getLogger(RedisAPI.class);
	
	/**
	 * 确认一个key是否存在 
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static Boolean exists(int selectIndex,String key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.exists(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
            RedisUtil.returnResource(jedis);
        }
		return false;
	}
	
	/**
	 * 确认一个key是否存在 
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static Boolean exists(int selectIndex,byte[] key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.exists(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return false;
	}
	
	/**
	 * 删除一个key
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static Long del(int selectIndex,String key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.del(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 删除一个key
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static Long del(int selectIndex,byte[] key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.del(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 删除一个key
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static Long del(int selectIndex,String... key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.del(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 删除一个key
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static Long del(int selectIndex,byte[]... key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.del(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回值的类型 
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static String type(int selectIndex,String key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.type(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回值的类型 
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static String type(int selectIndex,byte[] key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.type(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回满足给定pattern的所有key
	 * @param selectIndex
	 * @param pattern
	 * @return
	 */
	public static Set<String> keys(int selectIndex,String pattern){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.keys(pattern);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回满足给定pattern的所有key
	 * @param selectIndex
	 * @param pattern
	 * @return
	 */
	public static Set<byte[]> keys(int selectIndex,byte[] pattern){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.keys(pattern);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 随机返回key空间的一个key
	 * @param selectIndex
	 * @return
	 */
	public static String randomKey(int selectIndex){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.randomKey();
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 随机返回key空间的一个key
	 * @param selectIndex
	 * @return
	 */
	public static byte[] randomBinaryKey(int selectIndex){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.randomBinaryKey();
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 为指定指定的键重新命名，如果参数中的两个Keys的命令相同，或者是源Key不存在，该命令都会返回相关的错误信息。
	 * 如果newKey已经存在，则直接覆盖。 
	 * @param selectIndex
	 * @param oldkey
	 * @param newkey
	 * @return
	 */
	public static String rename(int selectIndex,String oldkey,String newkey){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.rename(oldkey, newkey);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 为指定指定的键重新命名，如果参数中的两个Keys的命令相同，或者是源Key不存在，该命令都会返回相关的错误信息。
	 * 如果newKey已经存在，则直接覆盖。 
	 * @param selectIndex
	 * @param oldkey
	 * @param newkey
	 * @return
	 */
	public static String rename(int selectIndex,byte[] oldkey,byte[] newkey){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.rename(oldkey, newkey);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 为指定指定的键重新命名，如果参数中的两个Keys的命令相同，或者是源Key不存在，该命令都会返回相关的错误信息。
	 * 如果新值不存在，则将参数中的原值修改为新值
	 * @param selectIndex
	 * @param oldkey
	 * @param newkey
	 * @return 1表示修改成功，否则0
	 */
	public static Long renamenx(int selectIndex,String oldkey,String newkey){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.renamenx(oldkey, newkey);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 为指定指定的键重新命名，如果参数中的两个Keys的命令相同，或者是源Key不存在，该命令都会返回相关的错误信息。
	 * 如果新值不存在，则将参数中的原值修改为新值
	 * @param selectIndex
	 * @param oldkey
	 * @param newkey
	 * @return 1表示修改成功，否则0
	 */
	public static Long renamenx(int selectIndex,byte[] oldkey,byte[] newkey){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.renamenx(oldkey, newkey);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 如果Key存在过期时间，该命令会将其过期时间消除，使该Key不再有超时，而是可以持久化存储。
	 * @param selectIndex
	 * @param key
	 * @return 1表示Key的过期时间被移出，0表示该Key不存在或没有过期时间。
	 */
	public static Long persist(int selectIndex,String key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.persist(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 如果Key存在过期时间，该命令会将其过期时间消除，使该Key不再有超时，而是可以持久化存储。
	 * @param selectIndex
	 * @param key
	 * @return 1表示Key的过期时间被移出，0表示该Key不存在或没有过期时间。
	 */
	public static Long persist(int selectIndex,byte[] key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.persist(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 该命令为参数中指定的Key设定超时的秒数，在超过该时间后，Key被自动的删除。
	 * 如果该Key在超时之前被修改，与该键关联的超时将被移除。 
	 * @param selectIndex
	 * @param key
	 * @return 1表示超时被设置，0则表示Key不存在，或不能被设置。
	 */
	public static Long expire(int selectIndex,String key,int seconds){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.expire(key, seconds);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 该命令为参数中指定的Key设定超时的秒数，在超过该时间后，Key被自动的删除。
	 * 如果该Key在超时之前被修改，与该键关联的超时将被移除。 
	 * @param selectIndex
	 * @param key
	 * @return 1表示超时被设置，0则表示Key不存在，或不能被设置。
	 */
	public static Long expire(int selectIndex,byte[] key,int seconds){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.expire(key, seconds);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 该命令的逻辑功能和EXPIRE完全相同，唯一的差别是该命令指定的超时时间是绝对时间，而不是相对时间。
	 * 该时间参数是Unix timestamp格式的，即从1970年1月1日开始所流经的秒数。
	 * @param selectIndex
	 * @param key
	 * @return 1表示超时被设置，0则表示Key不存在，或不能被设置。
	 */
	public static Long expireAt(int selectIndex,String key,long unixTime){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.expireAt(key, unixTime);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 该命令的逻辑功能和EXPIRE完全相同，唯一的差别是该命令指定的超时时间是绝对时间，而不是相对时间。
	 * 该时间参数是Unix timestamp格式的，即从1970年1月1日开始所流经的秒数。
	 * @param selectIndex
	 * @param key
	 * @return 1表示超时被设置，0则表示Key不存在，或不能被设置。
	 */
	public static Long expireAt(int selectIndex,byte[] key,long unixTime){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.expireAt(key, unixTime);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 获得一个key的活动时间 
	 * @param selectIndex
	 * @param key
	 * @return 返回所剩活动时间 ，如果该键不存在或没有超时设置，则返回-1。
	 */
	public static Long ttl(int selectIndex,String key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.ttl(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 获得一个key的活动时间 
	 * @param selectIndex
	 * @param key
	 * @return 返回所剩活动时间 ，如果该键不存在或没有超时设置，则返回-1。
	 */
	public static Long ttl(int selectIndex,byte[] key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.ttl(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 将当前数据库中指定的键Key移动到参数中指定的数据库中。
	 * 如果该Key在目标数据库中已经存在，或者在当前数据库中并不存在，该命令将不做任何操作并返回0。  
	 * @param oleSelectIndex
	 * @param key
	 * @param newSelectIndex
	 * @return 移动成功返回1，否则0。
	 */
	public static Long move(int oleSelectIndex,String key,int newSelectIndex){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(oleSelectIndex);
			return jedis.move(key,newSelectIndex);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 将当前数据库中指定的键Key移动到参数中指定的数据库中。
	 * 如果该Key在目标数据库中已经存在，或者在当前数据库中并不存在，该命令将不做任何操作并返回0。  
	 * @param oleSelectIndex
	 * @param key
	 * @param newSelectIndex
	 * @return 移动成功返回1，否则0。
	 */
	public static Long move(int oleSelectIndex,byte[] key,int newSelectIndex){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(oleSelectIndex);
			return jedis.move(key,newSelectIndex);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 给数据库中名称为key的string赋予值value
	 * @param selectIndex
	 * @param key
	 * @param value
	 * @return
	 */
	public static String set(int selectIndex,String key,String value){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.set(key, value);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 给数据库中名称为key的string赋予值value
	 * @param selectIndex
	 * @param key
	 * @param value
	 * @return
	 */
	public static String set(int selectIndex,byte[] key,byte[] value){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.set(key, value);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回数据库中名称为key的string的value
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static String get(int selectIndex,String key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.get(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回数据库中名称为key的byte[]的value
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static byte[] get(int selectIndex,byte[] key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.get(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 给名称为key的string赋予新的value并返回上一次的value 
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static String getSet(int selectIndex,String key,String value){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.getSet(key,value);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 给名称为key的byte[]赋予新的value并返回上一次的value 
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static byte[] getSet(int selectIndex,byte[] key,byte[] value){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.getSet(key,value);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回库中多个string（它们的名称为key1，key2…）的value 
	 * @param selectIndex
	 * @param keys
	 * @return
	 */
	public static List<String> mget(int selectIndex,String... keys){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.mget(keys);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回库中多个string（它们的名称为key1，key2…）的value 
	 * @param selectIndex
	 * @param keys
	 * @return
	 */
	public static List<byte[]> mget(int selectIndex,byte[]... keys){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.mget(keys);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 如果不存在名称为key的string，则向库中添加string，名称为key，值为value
	 * @param selectIndex
	 * @param key
	 * @param value
	 * @return
	 */
	public static Long setnx(int selectIndex,String key,String value){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.setnx(key, value);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 如果不存在名称为key的string，则向库中添加string，名称为key，值为value
	 * @param selectIndex
	 * @param key
	 * @param value
	 * @return
	 */
	public static Long setnx(int selectIndex,byte[] key,byte[] value){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.setnx(key, value);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 向库中添加string（名称为key，值为value）同时，设定过期时间time
	 * @param selectIndex
	 * @param key
	 * @param value
	 * @return
	 */
	public static String setex(int selectIndex,String key,int seconds,String value){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.setex(key, seconds, value);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 向库中添加string（名称为key，值为value）同时，设定过期时间time
	 * @param selectIndex
	 * @param key
	 * @param value
	 * @return
	 */
	public static String setex(int selectIndex,byte[] key,int seconds,byte[] value){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.setex(key, seconds, value);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * mset(key1, value1, key2, value2,…key N, value N)：
	 * 同时给多个string赋值，名称为key i的string赋值value i
	 * @param selectIndex
	 * @param keysvalues
	 * @return
	 */
	public static String mset(int selectIndex,String... keysvalues){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.mset(keysvalues);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * mset(key1, value1, key2, value2,…key N, value N)：
	 * 同时给多个string赋值，名称为key i的string赋值value i
	 * @param selectIndex
	 * @param keysvalues
	 * @return
	 */
	public static String mset(int selectIndex,byte[]... keysvalues){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.mset(keysvalues);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * msetnx(key1, value1, key2, value2,…key N, value N)：
	 * 如果所有名称为key i的string都不存在，则向库中添加string，名称key i赋值为value i
	 * @param selectIndex
	 * @param keysvalues
	 * @return
	 */
	public static Long msetnx(int selectIndex,String... keysvalues){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.msetnx(keysvalues);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * msetnx(key1, value1, key2, value2,…key N, value N)：
	 * 如果所有名称为key i的string都不存在，则向库中添加string，名称key i赋值为value i
	 * @param selectIndex
	 * @param keysvalues
	 * @return
	 */
	public static Long msetnx(int selectIndex,byte[]... keysvalues){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.msetnx(keysvalues);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 名称为key的string增1操作
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static Long incr(int selectIndex,String key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.incr(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 名称为key的string增1操作
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static Long incr(int selectIndex,byte[] key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.incr(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 名称为key的string增加integer
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static Long incrBy(int selectIndex,String key,long integer){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.incrBy(key, integer);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 名称为key的string增加integer
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static Long incrBy(int selectIndex,byte[] key,long integer){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.incrBy(key,integer);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 名称为key的string减1操作
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static Long decr(int selectIndex,String key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.decr(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 名称为key的string减1操作
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static Long decr(int selectIndex,byte[] key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.decr(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 名称为key的string减少integer
	 * @param selectIndex
	 * @param key
	 * @param integer
	 * @return
	 */
	public static Long decrBy(int selectIndex,String key,long integer){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.decrBy(key, integer);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 名称为key的string减少integer
	 * @param selectIndex
	 * @param key
	 * @param integer
	 * @return
	 */
	public static Long decrBy(int selectIndex,byte[] key,long integer){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.decrBy(key,integer);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 名称为key的string的值附加value 
	 * @param selectIndex
	 * @param key
	 * @param value
	 * @return
	 */
	public static Long append(int selectIndex,String key,String value){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.append(key, value);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 名称为key的string的值附加value 
	 * @param selectIndex
	 * @param key
	 * @param value
	 * @return
	 */
	public static Long append(int selectIndex,byte[] key,byte[] value){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.append(key, value);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的string的value的子串
	 * @param selectIndex
	 * @param key
	 * @param start
	 * @param end
	 * @return
	 */
	public static String substr(int selectIndex,String key,int start,int end){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.substr(key, start, end);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的string的value的子串
	 * @param selectIndex
	 * @param key
	 * @param start
	 * @param end
	 * @return
	 */
	public static byte[] substr(int selectIndex,byte[] key,int start,int end){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.substr(key, start, end);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 在名称为key的list尾添加一个值为value的 元素
	 * @param selectIndex
	 * @param key
	 * @param strings
	 * @return
	 */
	public static Long rpush(int selectIndex,String key,String... strings){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.rpush(key, strings);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
            RedisUtil.returnResource(jedis);
        }
		return null;
	}
	
	/**
	 * 在名称为key的list尾添加一个值为value的 元素
	 * @param selectIndex
	 * @param key
	 * @param strings
	 * @return
	 */
	public static Long rpush(int selectIndex,byte[] key,byte[]... strings){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.rpush(key, strings);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 在名称为key的list头添加一个值为value的 元素
	 * @param selectIndex
	 * @param key
	 * @param strings
	 * @return
	 */
	public static Long lpush(int selectIndex,String key,String... strings){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.lpush(key, strings);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 在名称为key的list头添加一个值为value的 元素
	 * @param selectIndex
	 * @param key
	 * @param strings
	 * @return
	 */
	public static Long lpush(int selectIndex,byte[] key,byte[]... strings){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.lpush(key, strings);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的list的长度
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static Long llen(int selectIndex,String key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.llen(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的list的长度
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static Long llen(int selectIndex,byte[] key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.llen(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的list中start至end之间的元素（下标从0开始，下同）
	 * @param selectIndex
	 * @param key
	 * @param start
	 * @param end
	 * @return
	 */
	public static List<String> lrange(int selectIndex,String key,long start,long end){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.lrange(key, start, end);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的list中start至end之间的元素（下标从0开始，下同）
	 * @param selectIndex
	 * @param key
	 * @param start
	 * @param end
	 * @return
	 */
	public static List<byte[]> lrange(int selectIndex,byte[] key,long start,long end){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.lrange(key, start, end);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 截取名称为key的list，保留start至end之间的元素
	 * @param selectIndex
	 * @param key
	 * @param start
	 * @param end
	 * @return
	 */
	public static String ltrim(int selectIndex,String key,long start,long end){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.ltrim(key, start, end);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 截取名称为key的list，保留start至end之间的元素
	 * @param selectIndex
	 * @param key
	 * @param start
	 * @param end
	 * @return
	 */
	public static String ltrim(int selectIndex,byte[] key,long start,long end){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.ltrim(key, start, end);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的list中index位置的元素
	 * @param selectIndex
	 * @param key
	 * @param index
	 * @return
	 */
	public static String lindex(int selectIndex,String key,long index){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.lindex(key, index);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的list中index位置的元素
	 * @param selectIndex
	 * @param key
	 * @param index
	 * @return
	 */
	public static byte[] lindex(int selectIndex,byte[] key,long index){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.lindex(key, index);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 给名称为key的list中index位置的元素赋值为value
	 * @param selectIndex
	 * @param key
	 * @param index
	 * @param value
	 * @return
	 */
	public static String lset(int selectIndex,String key,long index,String value){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.lset(key, index, value);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 给名称为key的list中index位置的元素赋值为value
	 * @param selectIndex
	 * @param key
	 * @param index
	 * @param value
	 * @return
	 */
	public static String lset(int selectIndex,byte[] key,long index,byte[] value){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.lset(key, index, value);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 删除count个名称为key的list中值为value的元素。count为0，删除所有值为value的元素，
	 * count>0从头至尾删除count个值为value的元素，count<0从尾到头删除|count|个值为value的元素。
	 * @param selectIndex
	 * @param key
	 * @param index
	 * @param value
	 * @return
	 */
	public static Long lrem(int selectIndex,String key,long index,String value){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.lrem(key, index, value);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 删除count个名称为key的list中值为value的元素。count为0，删除所有值为value的元素，
	 * count>0从头至尾删除count个值为value的元素，count<0从尾到头删除|count|个值为value的元素。
	 * @param selectIndex
	 * @param key
	 * @param index
	 * @param value
	 * @return
	 */
	public static Long lrem(int selectIndex,byte[] key,long index,byte[] value){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.lrem(key, index, value);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回并删除名称为key的list中的首元素
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static String lpop(int selectIndex,String key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.lpop(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回并删除名称为key的list中的首元素
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static byte[] lpop(int selectIndex,byte[] key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.lpop(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回并删除名称为key的list中的尾元素
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static String rpop(int selectIndex,String key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.rpop(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回并删除名称为key的list中的尾元素
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static byte[] rpop(int selectIndex,byte[] key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.rpop(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * lpop命令的block版本
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static List<String> blpop(int selectIndex,String key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.blpop(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * lpop命令的block版本
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static List<byte[]> blpop(int selectIndex,byte[] key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.blpop(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * lpop命令的block版本
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static List<String> blpop(int selectIndex,String... key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.blpop(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * lpop命令的block版本
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static List<byte[]> blpop(int selectIndex,byte[]... key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.blpop(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * lpop命令的block版本。即当timeout为0时，若遇到名称为key i的list不存在或该list为空，则命令结束。
	 * 如果timeout>0，则遇到上述情况时，等待timeout秒，如果问题没有解决，则对keyi+1开始的list执行pop操作。
	 * @param selectIndex
	 * @param timeout
	 * @param key
	 * @return
	 */
	public static List<String> blpop(int selectIndex,int timeout,String... key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.blpop(timeout,key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * lpop命令的block版本。即当timeout为0时，若遇到名称为key i的list不存在或该list为空，则命令结束。
	 * 如果timeout>0，则遇到上述情况时，等待timeout秒，如果问题没有解决，则对keyi+1开始的list执行pop操作。
	 * @param selectIndex
	 * @param timeout
	 * @param key
	 * @return
	 */
	public static List<byte[]> blpop(int selectIndex,int timeout,byte[]... key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.blpop(timeout,key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * rpop命令的block版本
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static List<String> brpop(int selectIndex,String key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.brpop(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * rpop命令的block版本
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static List<byte[]> brpop(int selectIndex,byte[] key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.brpop(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * rpop命令的block版本
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static List<String> brpop(int selectIndex,String... key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.brpop(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * rpop命令的block版本
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static List<byte[]> brpop(int selectIndex,byte[]... key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.brpop(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * rpop命令的block版本。即当timeout为0时，若遇到名称为key i的list不存在或该list为空，则命令结束。
	 * 如果timeout>0，则遇到上述情况时，等待timeout秒，如果问题没有解决，则对keyi+1开始的list执行pop操作。
	 * @param selectIndex
	 * @param timeout
	 * @param key
	 * @return
	 */
	public static List<String> brpop(int selectIndex,int timeout,String... key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.brpop(timeout,key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * rpop命令的block版本。即当timeout为0时，若遇到名称为key i的list不存在或该list为空，则命令结束。
	 * 如果timeout>0，则遇到上述情况时，等待timeout秒，如果问题没有解决，则对keyi+1开始的list执行pop操作。
	 * @param selectIndex
	 * @param timeout
	 * @param key
	 * @return
	 */
	public static List<byte[]> brpop(int selectIndex,int timeout,byte[]... key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.brpop(timeout,key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回并删除名称为srckey的list的尾元素，并将该元素添加到名称为dstkey的list的头部 
	 * @param selectIndex
	 * @param srckey
	 * @param dstkey
	 * @return
	 */
	public static String rpoplpush(int selectIndex,String srckey,String dstkey){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.rpoplpush(srckey, dstkey);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回并删除名称为srckey的list的尾元素，并将该元素添加到名称为dstkey的list的头部 
	 * @param selectIndex
	 * @param srckey
	 * @param dstkey
	 * @return
	 */
	public static byte[] rpoplpush(int selectIndex,byte[] srckey,byte[] dstkey){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.rpoplpush(srckey, dstkey);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 向名称为key的set中添加元素members
	 * @param selectIndex
	 * @param key
	 * @param members
	 * @return
	 */
	public static Long sadd(int selectIndex,String key,String... members){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.sadd(key, members);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 向名称为key的set中添加元素members
	 * @param selectIndex
	 * @param key
	 * @param members
	 * @return
	 */
	public static Long sadd(int selectIndex,byte[] key,byte[]... members){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.sadd(key, members);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 删除名称为key的set中的元素members
	 * @param selectIndex
	 * @param key
	 * @param members
	 * @return
	 */
	public static Long srem(int selectIndex,String key,String... members){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.srem(key, members);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 删除名称为key的set中的元素members
	 * @param selectIndex
	 * @param key
	 * @param members
	 * @return
	 */
	public static Long srem(int selectIndex,byte[] key,byte[]... members){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.srem(key, members);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 随机返回并删除名称为key的set中一个元素 
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static String spop(int selectIndex,String key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.spop(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 随机返回并删除名称为key的set中一个元素 
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static byte[] spop(int selectIndex,byte[] key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.spop(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 将member元素从名称为srckey的集合移到名称为dstkey的集合
	 * @param selectIndex
	 * @param srckey
	 * @param dstkey
	 * @param member
	 * @return
	 */
	public static Long smove(int selectIndex,String srckey,String dstkey,String member){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.smove(srckey, dstkey, member);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 将member元素从名称为srckey的集合移到名称为dstkey的集合
	 * @param selectIndex
	 * @param srckey
	 * @param dstkey
	 * @param member
	 * @return
	 */
	public static Long smove(int selectIndex,byte[] srckey,byte[] dstkey,byte[] member){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.smove(srckey, dstkey, member);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的set的基数(size)
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static Long scard(int selectIndex,String key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.scard(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的set的基数(size)
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static Long scard(int selectIndex,byte[] key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.scard(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 测试member是否是名称为key的set的元素
	 * @param selectIndex
	 * @param key
	 * @param member
	 * @return
	 */
	public static Boolean sismember(int selectIndex,String key,String member){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.sismember(key, member);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 测试member是否是名称为key的set的元素
	 * @param selectIndex
	 * @param key
	 * @param member
	 * @return
	 */
	public static Boolean sismember(int selectIndex,byte[] key,byte[] member){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.sismember(key, member);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 求交集
	 * @param selectIndex
	 * @param keys
	 * @return
	 */
	public static Set<String> sinter(int selectIndex,String... keys){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.sinter(keys);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 求交集
	 * @param selectIndex
	 * @param keys
	 * @return
	 */
	public static Set<byte[]> sinter(int selectIndex,byte[]... keys){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.sinter(keys);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 求交集并将交集保存到dstkey的集合
	 * @param selectIndex
	 * @param dstkey
	 * @param keys
	 * @return
	 */
	public static Long sinterstore(int selectIndex,String dstkey,String... keys){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.sinterstore(dstkey, keys);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 求交集并将交集保存到dstkey的集合
	 * @param selectIndex
	 * @param dstkey
	 * @param keys
	 * @return
	 */
	public static Long sinterstore(int selectIndex,byte[] dstkey,byte[]... keys){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.sinterstore(dstkey,keys);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 求并集
	 * @param selectIndex
	 * @param keys
	 * @return
	 */
	public static Set<String> sunion(int selectIndex,String... keys){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.sunion(keys);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 求并集
	 * @param selectIndex
	 * @param keys
	 * @return
	 */
	public static Set<byte[]> sunion(int selectIndex,byte[]... keys){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.sunion(keys);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 求并集并将并集保存到dstkey的集合
	 * @param selectIndex
	 * @param dstkey
	 * @param keys
	 * @return
	 */
	public static Long sunionstore(int selectIndex,String dstkey,String... keys){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.sunionstore(dstkey,keys);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 求并集并将并集保存到dstkey的集合
	 * @param selectIndex
	 * @param dstkey
	 * @param keys
	 * @return
	 */
	public static Long sunionstore(int selectIndex,byte[] dstkey,byte[]... keys){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.sunionstore(dstkey,keys);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 求差集
	 * @param selectIndex
	 * @param keys
	 * @return
	 */
	public static Set<String> sdiff(int selectIndex,String... keys){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.sdiff(keys);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 求差集
	 * @param selectIndex
	 * @param keys
	 * @return
	 */
	public static Set<byte[]> sdiff(int selectIndex,byte[]... keys){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.sdiff(keys);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 求差集并将差集保存到dstkey的集合
	 * @param selectIndex
	 * @param dstkey
	 * @param keys
	 * @return
	 */
	public static Long sdiffstore(int selectIndex,String dstkey,String... keys){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.sdiffstore(dstkey,keys);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 求差集并将差集保存到dstkey的集合
	 * @param selectIndex
	 * @param dstkey
	 * @param keys
	 * @return
	 */
	public static Long sdiffstore(int selectIndex,byte[] dstkey,byte[]... keys){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.sdiffstore(dstkey,keys);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的set的所有元素
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static Set<String> smembers(int selectIndex,String key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.smembers(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的set的所有元素
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static Set<byte[]> smembers(int selectIndex,byte[] key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.smembers(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 随机返回名称为key的set的一个元素
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static String srandmember(int selectIndex,String key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.srandmember(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 随机返回名称为key的set的一个元素
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static byte[] srandmember(int selectIndex,byte[] key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.srandmember(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 向名称为key的zset中添加元素member，score用于排序。如果该元素已经存在，则根据score更新该元素的顺序。
	 * @param selectIndex
	 * @param key
	 * @param score
	 * @param member
	 * @return
	 */
	public static Long zadd(int selectIndex,String key,double score,String member){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.zadd(key, score, member);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 向名称为key的zset中添加元素member，score用于排序。如果该元素已经存在，则根据score更新该元素的顺序。
	 * @param selectIndex
	 * @param key
	 * @param score
	 * @param member
	 * @return
	 */
	public static Long zadd(int selectIndex,byte[] key,double score,byte[] member){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.zadd(key, score, member);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 向名称为key的zset中添加元素map，String为value，Double用于排序。如果该元素已经存在，则根据Double更新该元素的顺序。
	 * @param selectIndex
	 * @param key
	 * @param scoreMembers
	 * @return
	 */
	public static Long zadd(int selectIndex,String key,Map<String,Double> scoreMembers){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.zadd(key, scoreMembers);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 向名称为key的zset中添加元素map，String为value，Double用于排序。如果该元素已经存在，则根据Double更新该元素的顺序。
	 * @param selectIndex
	 * @param key
	 * @param scoreMembers
	 * @return
	 */
	public static Long zadd(int selectIndex,byte[] key,Map<byte[],Double> scoreMembers){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.zadd(key, scoreMembers);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 删除名称为key的zset中的元素member 
	 * @param selectIndex
	 * @param key
	 * @param members
	 * @return
	 */
	public static Long zrem(int selectIndex,String key,String... members){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.zrem(key, members);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 删除名称为key的zset中的元素member 
	 * @param selectIndex
	 * @param key
	 * @param members
	 * @return
	 */
	public static Long zrem(int selectIndex,byte[] key,byte[]... members){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.zrem(key, members);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 如果在名称为key的zset中已经存在元素member，则该元素的score增加increment；否则向集合中添加该元素，其score的值为increment
	 * @param selectIndex
	 * @param key
	 * @param score
	 * @param member
	 * @return
	 */
	public static Double zincrby(int selectIndex,String key,double score,String member){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.zincrby(key, score, member);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 如果在名称为key的zset中已经存在元素member，则该元素的score增加increment；否则向集合中添加该元素，其score的值为increment
	 * @param selectIndex
	 * @param key
	 * @param score
	 * @param member
	 * @return
	 */
	public static Double zincrby(int selectIndex,byte[] key,double score,byte[] member){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.zincrby(key, score, member);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的zset（元素已按score从小到大排序）中member元素的rank（即index，从0开始），若没有member元素，返回“nil”
	 * @param selectIndex
	 * @param key
	 * @param member
	 * @return
	 */
	public static Long zrank(int selectIndex,String key,String member){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.zrank(key, member);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的zset（元素已按score从小到大排序）中member元素的rank（即index，从0开始），若没有member元素，返回“nil”
	 * @param selectIndex
	 * @param key
	 * @param member
	 * @return
	 */
	public static Long zrank(int selectIndex,byte[] key,byte[] member){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.zrank(key, member);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的zset（元素已按score从大到小排序）中member元素的rank（即index，从0开始），若没有member元素，返回“nil”
	 * @param selectIndex
	 * @param key
	 * @param member
	 * @return
	 */
	public static Long zrevrank(int selectIndex,String key,String member){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.zrevrank(key, member);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的zset（元素已按score从大到小排序）中member元素的rank（即index，从0开始），若没有member元素，返回“nil”
	 * @param selectIndex
	 * @param key
	 * @param member
	 * @return
	 */
	public static Long zrevrank(int selectIndex,byte[] key,byte[] member){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.zrevrank(key, member);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的zset（元素已按score从小到大排序）中的index从start到end的所有元素
	 * @param selectIndex
	 * @param key
	 * @param start
	 * @param end
	 * @return
	 */
	public static Set<String> zrange(int selectIndex,String key,long start,long end){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.zrange(key, start, end);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的zset（元素已按score从小到大排序）中的index从start到end的所有元素
	 * @param selectIndex
	 * @param key
	 * @param start
	 * @param end
	 * @return
	 */
	public static Set<byte[]> zrange(int selectIndex,byte[] key,long start,long end){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.zrange(key, start, end);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的zset（元素已按score从大到小排序）中的index从start到end的所有元素
	 * @param selectIndex
	 * @param key
	 * @param start
	 * @param end
	 * @return
	 */
	public static Set<String> zrevrange(int selectIndex,String key,long start,long end){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.zrevrange(key, start, end);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的zset（元素已按score从大到小排序）中的index从start到end的所有元素
	 * @param selectIndex
	 * @param key
	 * @param start
	 * @param end
	 * @return
	 */
	public static Set<byte[]> zrevrange(int selectIndex,byte[] key,long start,long end){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.zrevrange(key, start, end);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的zset中score >= min且score <= max的所有元素
	 * @param selectIndex
	 * @param key
	 * @param min
	 * @param max
	 * @return
	 */
	public static Set<String> zrangebyscore(int selectIndex,String key,double min,double max){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.zrangeByScore(key, min, max);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的zset中score >= min且score <= max的所有元素
	 * @param selectIndex
	 * @param key
	 * @param min
	 * @param max
	 * @return
	 */
	public static Set<byte[]> zrangebyscore(int selectIndex,byte[] key,double min,double max){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.zrangeByScore(key, min, max);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的zset的基数(size)
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static Long zcard(int selectIndex,String key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.zcard(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的zset的基数(size)
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static Long zcard(int selectIndex,byte[] key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.zcard(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的zset中元素element的score
	 * @param selectIndex
	 * @param key
	 * @param member
	 * @return
	 */
	public static Double zscore(int selectIndex,String key,String member){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.zscore(key, member);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的zset中元素element的score
	 * @param selectIndex
	 * @param key
	 * @param member
	 * @return
	 */
	public static Double zscore(int selectIndex,byte[] key,byte[] member){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.zscore(key, member);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 删除名称为key的zset中rank >= min且rank <= max的所有元素（元素按score从小到大排序）
	 * @param selectIndex
	 * @param key
	 * @param start
	 * @param end
	 * @return
	 */
	public static Long zremrangebyrank(int selectIndex,String key,long start,long end){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.zremrangeByRank(key, start, end);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 删除名称为key的zset中rank >= min且rank <= max的所有元素（元素按score从小到大排序）
	 * @param selectIndex
	 * @param key
	 * @param start
	 * @param end
	 * @return
	 */
	public static Long zremrangebyrank(int selectIndex,byte[] key,long start,long end){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.zremrangeByRank(key, start, end);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 删除名称为key的zset中score >= min且score <= max的所有元素
	 * @param selectIndex
	 * @param key
	 * @param start
	 * @param end
	 * @return
	 */
	public static Long zremrangebyscore(int selectIndex,String key,double start,double end){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.zremrangeByScore(key, start, end);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 删除名称为key的zset中score >= min且score <= max的所有元素
	 * @param selectIndex
	 * @param key
	 * @param start
	 * @param end
	 * @return
	 */
	public static Long zremrangebyscore(int selectIndex,byte[] key,double start,double end){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.zremrangeByScore(key, start, end);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 向名称为key的hash中添加元素field<—>value
	 * @param selectIndex
	 * @param key
	 * @param field
	 * @param value
	 * @return
	 */
	public static Long hset(int selectIndex,String key,String field,String value){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.hset(key, field, value);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 向名称为key的hash中添加元素field<—>value
	 * @param selectIndex
	 * @param key
	 * @param field
	 * @param value
	 * @return
	 */
	public static Long hset(int selectIndex,byte[] key,byte[] field,byte[] value){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.hset(key, field, value);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的hash中field对应的value
	 * @param selectIndex
	 * @param key
	 * @param field
	 * @return
	 */
	public static String hget(int selectIndex,String key,String field){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.hget(key, field);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的hash中field对应的value
	 * @param selectIndex
	 * @param key
	 * @param field
	 * @return
	 */
	public static byte[] hget(int selectIndex,byte[] key,byte[] field){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.hget(key, field);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的hash中field i对应的value
	 * @param selectIndex
	 * @param key
	 * @param field
	 * @return
	 */
	public static List<String> hmget(int selectIndex,String key,String... field){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.hmget(key, field);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的hash中field i对应的value
	 * @param selectIndex
	 * @param key
	 * @param field
	 * @return
	 */
	public static List<byte[]> hmget(int selectIndex,byte[] key,byte[]... field){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.hmget(key, field);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 向名称为key的hash中添加元素field i<—>value i
	 * @param selectIndex
	 * @param key
	 * @param hash
	 * @return
	 */
	public static String hmset(int selectIndex,String key,Map<String,String> hash){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.hmset(key, hash);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 向名称为key的hash中添加元素field i<—>value i
	 * @param selectIndex
	 * @param key
	 * @param hash
	 * @return
	 */
	public static String hmset(int selectIndex,byte[] key,Map<byte[],byte[]> hash){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.hmset(key, hash);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 将名称为key的hash中field的value增加integer
	 * @param selectIndex
	 * @param key
	 * @param field
	 * @param value
	 * @return
	 */
	public static Long hincrby(int selectIndex,String key,String field,long value){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.hincrBy(key, field, value);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 将名称为key的hash中field的value增加integer
	 * @param selectIndex
	 * @param key
	 * @param field
	 * @param value
	 * @return
	 */
	public static Long hincrby(int selectIndex,byte[] key,byte[] field,long value){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.hincrBy(key, field, value);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 名称为key的hash中是否存在键为field的域
	 * @param selectIndex
	 * @param key
	 * @param field
	 * @return
	 */
	public static Boolean hexists(int selectIndex,String key,String field){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.hexists(key, field);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 名称为key的hash中是否存在键为field的域
	 * @param selectIndex
	 * @param key
	 * @param field
	 * @return
	 */
	public static Boolean hexists(int selectIndex,byte[] key,byte[] field){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.hexists(key, field);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 删除名称为key的hash中键为field的域
	 * @param selectIndex
	 * @param key
	 * @param field
	 * @return
	 */
	public static Long hdel(int selectIndex,String key,String field){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.hdel(key, field);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 删除名称为key的hash中键为field的域
	 * @param selectIndex
	 * @param key
	 * @param field
	 * @return
	 */
	public static Long hdel(int selectIndex,byte[] key,byte[] field){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.hdel(key, field);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的hash中元素个数
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static Long hlen(int selectIndex,String key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.hlen(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的hash中元素个数
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static Long hlen(int selectIndex,byte[] key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.hlen(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的hash中所有键 （field）
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static Set<String> hkeys(int selectIndex,String key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.hkeys(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的hash中所有键 （field）
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static Set<byte[]> hkeys(int selectIndex,byte[] key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.hkeys(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的hash中所有键（field）对应的value
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static List<String> hvals(int selectIndex,String key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.hvals(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的hash中所有键（field）对应的value
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static List<byte[]> hvals(int selectIndex,byte[] key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.hvals(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的hash中所有的键（field）及其对应的value
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static Map<String,String> hgetAll(int selectIndex,String key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.hgetAll(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}
	
	/**
	 * 返回名称为key的hash中所有的键（field）及其对应的value
	 * @param selectIndex
	 * @param key
	 * @return
	 */
	public static Map<byte[],byte[]> hgetAll(int selectIndex,byte[] key){
		Jedis jedis = null;
		try {
			jedis = RedisUtil.getResource();
			jedis.select(selectIndex);
			return jedis.hgetAll(key);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		} finally {
			RedisUtil.returnResource(jedis);
		}
		return null;
	}

}
