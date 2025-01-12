package com.skillbrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LocatorExercices1 extends BaseTest {

    @Test
    public void testBasicWebPageExample() {
        // Go to test URL
        driver.get("https://testpages.herokuapp.com/styled/index.html.");

        // Verificarea titlului paginii
        String expectedTabTitle = "The Internet";
        String actualTabTitle = driver.getTitle();
        System.out.println("Titlul tabului paginii este: " + actualTabTitle);
        Assert.assertEquals(actualTabTitle, expectedTabTitle, "[1] Tabul paginii nu este cel asteptat de noi");

        // Ne gasim elementul de link checkboxes si dam click pe acesta
        WebElement checkboxesLink = driver.findElement(By.linkText("Checkboxes"));
        checkboxesLink.click();

        // ne cautam toate elementele de pe pagina
        WebElement titluPaginii = driver.findElement(By.cssSelector("#content h3"));
        WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));

        // interactionam cu elementele de pe pagina
        System.out.println("Titlul paginii este: " + titluPaginii.getText());
        //checkbox1.click();
        checkbox2.click();

        // Oprim executia testtului pentru a putea vedea stadiul final al paginii
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

