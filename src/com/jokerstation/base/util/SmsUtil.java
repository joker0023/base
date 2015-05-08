package com.jokerstation.base.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.jokerstation.base.data.BaseData;

/**
 * 短信发送工具类
 * @author Joker
 *
 */
public class SmsUtil {
	
	private static final Logger logger = Logger.getLogger(SmsUtil.class);

	/**
	 * 发送短信
	 * @param mobile
	 * @param sendMsg
	 * @return
	 * @throws Exception
	 */
	public static String sendSms(String mobile, String sendMsg) throws Exception {
		Map<String, String> params = new HashMap<String, String>();
		params.put("apikey", BaseData.smsAppKey);
		params.put("mobile", mobile.trim());
		params.put("text", sendMsg);
		String result = WebUtil.simpleDoPost(BaseData.smsApiUrl, params);
		
		logger.info("短信发送 mobile: " + mobile + " -- " + result);
	
		return result;
	}
}
