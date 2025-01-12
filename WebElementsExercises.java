package com.skillbrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebElementsExercises extends BaseTest{
    @Test
    public void testElementeCheckBox(){
        // Go to test URL
        driver.get("https://the-internet.herokuapp.com/");

        // Verificarea titlului paginii
        String expectedTabTitle = "Web Testing and Automation Practice Application Pages";
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

    @Test
    public void testForgotPassword(){
        // Go to test URL
        driver.get("https://the-internet.herokuapp.com/");

        // Verificarea titlului paginii
        String expectedTabTitle = "The Internet";
        String actualTabTitle = driver.getTitle();
        System.out.println("Titlul tabului paginii este: " + actualTabTitle);
        Assert.assertEquals(actualTabTitle, expectedTabTitle, "[1] Tabul paginii nu este cel asteptat de noi");

        // Ne gasim elementul de link checkboxes si dam click pe acesta
        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot Password"));
        forgotPasswordLink.click();

        // ne cautam elementele de pe pagina
        WebElement titlulPaginii = driver.findElement(By.cssSelector("#content h2"));
        WebElement textulInputului = driver.findElement(By.cssSelector("#forgot_password label"));
        WebElement inputElement = driver.findElement(By.cssSelector("#forgot_password #email"));
        WebElement buttonRetrievePassword = driver.findElement(By.cssSelector("#form_submit"));

        // intercationam cu elementele de pe pagina
        System.out.println("Titlul paginii este: " + titlulPaginii.getText());
        System.out.println("Textul inputului este: " + textulInputului.getText());
        inputElement.sendKeys("text introdus");

        // Oprim executia testtului pentru a putea vedea stadiul final al paginii
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        buttonRetrievePassword.click();

        // Oprim executia testtului pentru a putea vedea stadiul final al paginii
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAddRemoveElements(){
        // Go to test URL
        driver.get("https://the-internet.herokuapp.com/");

        // Verificarea titlului paginii
        String expectedTabTitle = "The Internet";
        String actualTabTitle = driver.getTitle();
        System.out.println("Titlul tabului paginii este: " + actualTabTitle);
        Assert.assertEquals(actualTabTitle, expectedTabTitle, "[1] Tabul paginii nu este cel asteptat de noi");

        // Ne gasim elementul de link checkboxes si dam click pe acesta
        WebElement addRemoveElementsLink = driver.findElement(By.linkText("Add/Remove Elements"));
        addRemoveElementsLink.click();

        // ne cautam elementele de pe pagina
        WebElement titltulPaginii = driver.findElement(By.cssSelector("#content h3"));
        WebElement addButton = driver.findElement(By.cssSelector("#content > div > button"));
        try {
            WebElement deleteButton = driver.findElement(By.cssSelector("#elements > button:nth-child(1)"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // interactiona cu elementele de pe pagina
        System.out.println("Titlul Paginii este: " + titltulPaginii.getText());
        addButton.click();
        addButton.click();
        addButton.click();

        // Oprim executia testtului pentru a putea vedea stadiul final al paginii
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            WebElement deleteButton = driver.findElement(By.cssSelector("#elements > button:nth-child(2)"));
            deleteButton.click();
        } catch (Exception e) {
            e.printStackTrace();
        }


        // Oprim executia testtului pentru a putea vedea stadiul final al paginii
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
