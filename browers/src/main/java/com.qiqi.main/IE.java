package com.qiqi.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {
    
    public static void main(String[] args) {
        //设置驱动路
        System.setProperty("webdriver.ie.driver", IE.class.getClassLoader().getResource("windows/IEDriverServer.exe").getPath());
        //创建谷歌浏览器驱动
        WebDriver webDriver = new InternetExplorerDriver();
        //访问百度
        webDriver.get("https://www.baidu.com");
        webDriver.findElement(By.id("kw")).sendKeys("hello world");//找到搜索框，填写hello world
        //webDriver.quit(); //关闭打开的浏览器
    }

}
