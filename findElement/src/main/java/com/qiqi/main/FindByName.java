package com.qiqi.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by abner.zhang on 18/3/14.
 */
public class FindByName {


    public static void main(String[] args) {
        //设置驱动路径,windows环境请将mac/chromedriver改成windows/chromedriver.exe
        System.setProperty("webdriver.chrome.driver", FindByName.class.getClassLoader().getResource("mac/chromedriver").getPath());
        //创建谷歌浏览器驱动
        WebDriver webDriver = new ChromeDriver();
        //访问百度
        webDriver.get("https://passport.baidu.com/v2/?reg");
        webDriver.findElement(By.name("userName")).sendKeys("findByName");//1.name唯一的情况
        
        //2.name不唯一的情况：
        List<WebElement> userNames = webDriver.findElements(By.name("userName"));
        //循环查找所有名称为userName的元素
        for(WebElement userName:userNames){
            //如果placeholder属性为请设置用户名，说明就是用户名的输入框
            if(userName.getAttribute("placeholder")!=null&&userName.getAttribute("placeholder").equals("请设置用户名")){
                userName.sendKeys("findByName");//填上findByName
            }
        }
//        webDriver.quit(); //关闭打开的浏览器
    }


}
