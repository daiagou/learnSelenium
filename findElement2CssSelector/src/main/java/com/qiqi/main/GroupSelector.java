package com.qiqi.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * 分组选择器
 * 可以同时查询多个元素
 */
public class GroupSelector {


    public static void main(String[] args) {
        //设置驱动路径,windows环境请将mac/chromedriver改成windows/chromedriver.exe
        System.setProperty("webdriver.chrome.driver", GroupSelector.class.getClassLoader().getResource("mac/chromedriver").getPath());
        //创建谷歌浏览器驱动
        WebDriver webDriver = new ChromeDriver();
        //访问百度
        webDriver.get("https://passport.baidu.com/v2/?reg");
        //查询id为TANGRAM__PSP_3__userName和id为TANGRAM__PSP_3__phone的元素
        List<WebElement> userNames = webDriver.findElements(By.cssSelector("#TANGRAM__PSP_3__userName,#TANGRAM__PSP_3__phone"));
        //循环
        for (WebElement userName : userNames) {
            userName.sendKeys("GroupSelector");//填上findByName
        }
//        webDriver.quit(); //关闭打开的浏览器
    }


}
