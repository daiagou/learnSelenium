package com.qiqi.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 伪类选择器
 * 查找id为TANGRAM__PSP_3__userNameWrapper下面的第三个子元素，该元素为input
 */
public class FakeSelector {


    public static void main(String[] args) {
        //设置驱动路径,windows环境请将mac/chromedriver改成windows/chromedriver.exe
        System.setProperty("webdriver.chrome.driver", IdSelector.class.getClassLoader().getResource("mac/chromedriver").getPath());
        //创建谷歌浏览器驱动
        WebDriver webDriver = new ChromeDriver();
        //访问百度
        webDriver.get("https://passport.baidu.com/v2/?reg");
        //id为TANGRAM__PSP_3__userNameWrapper下面的第三个子元素，该元素为input
        webDriver.findElement(By.cssSelector("#TANGRAM__PSP_3__userNameWrapper input:nth-child(3)")).sendKeys("FakeSelector");
        //webDriver.quit(); //关闭打开的浏览器
    }


}
