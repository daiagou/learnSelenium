package com.qiqi.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
    
    public static void main(String[] args) {
        //设置驱动路径,windows环境请将mac/chromedriver改成windows/geckodriver.exe
        System.setProperty("webdriver.gecko.driver", Firefox.class.getClassLoader().getResource("mac/geckodriver").getPath());
        //创建谷歌浏览器驱动
        WebDriver webDriver = new FirefoxDriver();
        //访问百度
        webDriver.get("https://www.baidu.com");
        webDriver.findElement(By.id("kw")).sendKeys("hello world");//找到搜索框，填写hello world
        //webDriver.quit(); //关闭打开的浏览器
    }
}
