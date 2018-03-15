package com.qiqi.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * 包含选择器
 */
public class ContainSelector {


    public static void main(String[] args) {
        //设置驱动路径,windows环境请将mac/chromedriver改成windows/chromedriver.exe
        System.setProperty("webdriver.chrome.driver", ContainSelector.class.getClassLoader().getResource("mac/chromedriver").getPath());
        //创建谷歌浏览器驱动
        WebDriver webDriver = new ChromeDriver();
        //访问百度
        webDriver.get("https://passport.baidu.com/v2/?reg");
        //包含在div下面的class为pass-text-input-userName的元素
        List<WebElement> userNames = webDriver.findElements(By.cssSelector("div .pass-text-input-userName"));
        //循环
        for(WebElement userName:userNames){
            //如果placeholder属性为请设置用户名，说明就是用户名的输入框
            if(userName.getAttribute("placeholder")!=null&&userName.getAttribute("placeholder").equals("请设置用户名")){
                userName.sendKeys("ContainSelector");//填上findByName
            }
        }
//        webDriver.quit(); //关闭打开的浏览器
    }


}
