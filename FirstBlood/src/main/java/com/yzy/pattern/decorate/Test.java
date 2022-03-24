package com.yzy.pattern.decorate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    private static Logger logger = LoggerFactory.getLogger(Test.class);
    public static void main(String[] args) {
/*        BatterCake batterCake = new BaseBatterCake();
        //batterCake = new EggDecorate(batterCake);
        batterCake = new SauageDecorate(batterCake);
        batterCake = new SauageDecorate(batterCake);


        System.out.println(batterCake.getMsg()+",总价："+batterCake.getPrice());

        String str = new String("hello");

        String str2 = str.intern();*/

        System.out.println(isContainChinese("，"));



    }
    /**
     * 字符串是否包含中文
     *
     * @param str 待校验字符串
     * @return true 包含中文字符 false 不包含中文字符
     */
    public static boolean isContainChinese(String str){

        Pattern p = Pattern.compile("[\u4E00-\u9FA5|\\！|\\，|\\。|\\（|\\）|\\《|\\》|\\“|\\”|\\？|\\：|\\；|\\【|\\】]");
        Matcher m = p.matcher(str);
        if (m.find()) {
            return true;
        }
        return false;
    }
}
