package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class StaticWebTable {
    public static String url = "https://syntaxprojects.com/table-search-filter-demo.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        //print all the rows of the webtable in the console

        //1.locate the rows in the table usinf xpath and save it in a variable
        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        //print the number of rows
        System.out.println("the number of rows is "+ tableRows.size());
        //2. iterate to each web element and get the text out of it
        for (WebElement row:tableRows) {
            System.out.println(row.getText());
        }
        //3. print all the headers
        List<WebElement> tableHeaders = driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
        System.out.println(tableHeaders.size());
        for (WebElement headers:tableHeaders) {
            System.out.println(headers.getText());
        }
        //4. print just the second column
        //locate the column using a locator
       List <WebElement> column = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[2]"));
        //iterate and get the text
        for (WebElement col:column) {
            System.out.println(col.getText());
        }



}


}
