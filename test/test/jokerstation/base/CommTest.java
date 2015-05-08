package test.jokerstation.base;

import com.jokerstation.base.data.BaseData;
import com.jokerstation.base.util.MailUtil;
import com.jokerstation.base.util.SmsUtil;

public class CommTest {

	public static void main(String[] args) {
		try{
			String mobile = "15017564850";
			String str = "正在找回密码，您的验证码是3344";
			
			String result = SmsUtil.sendSms(mobile, str);
			System.out.println(result);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
