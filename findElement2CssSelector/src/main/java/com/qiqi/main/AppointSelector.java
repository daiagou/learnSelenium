package com.qiqi.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 指定选择器
 */
public class AppointSelector {


    public static void main(String[] args) {
        //设置驱动路径,windows环境请将mac/chromedriver改成windows/chromedriver.exe
        System.setProperty("webdriver.chrome.driver", AppointSelector.class.getClassLoader().getResource("mac/chromedriver").getPath());
        //创建谷歌浏览器驱动
        WebDriver webDriver = new ChromeDriver();
        //访问百度
        webDriver.get("https://passport.baidu.com/v2/?reg");
        webDriver.findElement(By.cssSelector("input#TANGRAM__PSP_3__userName")).sendKeys("AppointSelector");
        //或者
        webDriver.findElement(By.cssSelector("input.pass-text-input-userName")).sendKeys("AppointSelector");
        //webDriver.quit(); //关闭打开的浏览器
    }


}
