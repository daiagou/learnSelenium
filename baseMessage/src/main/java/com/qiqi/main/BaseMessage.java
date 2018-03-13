package com.qiqi.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseMessage {

    public static void main(String[] args) {
        //设置驱动路径,windows环境请将mac/chromedriver改成windows/chromedriver.exe
        System.setProperty("webdriver.chrome.driver", BaseMessage.class.getClassLoader().getResource("mac/chromedriver").getPath());
        //创建谷歌浏览器驱动
        WebDriver webDriver = new ChromeDriver();
        //访问百度
        webDriver.get("https://www.baidu.com");

        System.out.println("当前url:"+webDriver.getCurrentUrl());
        System.out.println("页面源码:"+webDriver.getPageSource());
        System.out.println("页面标题:"+webDriver.getTitle());

        webDriver.quit(); //关闭打开的浏览器
    }


}
