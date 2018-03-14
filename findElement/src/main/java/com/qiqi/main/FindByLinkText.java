package com.qiqi.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by abner.zhang on 18/3/14.
 */
public class FindByLinkText {


    public static void main(String[] args) {
        //设置驱动路径,windows环境请将mac/chromedriver改成windows/chromedriver.exe
        System.setProperty("webdriver.chrome.driver", FindByLinkText.class.getClassLoader().getResource("mac/chromedriver").getPath());
        //创建谷歌浏览器驱动
        WebDriver webDriver = new ChromeDriver();
        //访问百度
        webDriver.get("https://passport.baidu.com/v2/?reg");
        webDriver.findElement(By.linkText("《百度用户协议》")).click();//1.linkText唯一的情况,click是点击一下
        
        //2.linkText不唯一的情况：
        List<WebElement> userNames = webDriver.findElements(By.linkText("《百度用户协议》"));
        //循环查找所有名称为userName的元素
        for(WebElement userName:userNames){
            //通过href属性判断是否是我们需要的<a>元素
            if(userName.getAttribute("href")!=null&&userName.getAttribute("href").equals("http://passport.baidu.com/static/passpc-account/html/protocal.html")){
                userName.click();//点击一下
            }
        }
//        webDriver.quit(); //关闭打开的浏览器
    }


}
