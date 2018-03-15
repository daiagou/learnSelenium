package com.qiqi.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 属性选择器
 */
public class PropertySelector {


    public static void main(String[] args) {
        //设置驱动路径,windows环境请将mac/chromedriver改成windows/chromedriver.exe
        System.setProperty("webdriver.chrome.driver", IdSelector.class.getClassLoader().getResource("mac/chromedriver").getPath());
        //创建谷歌浏览器驱动
        WebDriver webDriver = new ChromeDriver();
        //访问百度
        webDriver.get("https://passport.baidu.com/v2/?reg");
        //id为TANGRAM__PSP_3__userName的input元素
        webDriver.findElement(By.cssSelector("input[id='TANGRAM__PSP_3__userName']")).sendKeys("PropertySelector");
        //或者 name为userName的input
        webDriver.findElement(By.cssSelector("input[name='userName']")).sendKeys("PropertySelector");
        //或者其他属性。。。
        //webDriver.quit(); //关闭打开的浏览器
    }


}
