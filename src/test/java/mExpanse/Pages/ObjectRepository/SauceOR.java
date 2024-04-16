package mExpanse.Pages.ObjectRepository;

import org.openqa.selenium.By;

public class SauceOR {
    public static class Locator{
        public static By username = By.xpath("//INPUT[@id='user-name']");
        public static By password = By.xpath("//INPUT[@id='password']");
        public static By login = By.xpath("//INPUT[@id='login-button']");

        public static By p1_name = By.xpath("//DIV[@class='inventory_item_name '][text()='Sauce Labs Backpack']");
        public static By p1_des = By.xpath("//DIV[@class='inventory_item_desc'][text()='carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.']");
        public static By p1_price = By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/div");
        public static By p1_cart = By.xpath("//BUTTON[@id='add-to-cart-sauce-labs-backpack']");

        public static By p2_name = By.xpath("//DIV[@class='inventory_item_name '][text()='Sauce Labs Bike Light']");
        public static By p2_des = By.xpath("(//DIV[@class='inventory_item_desc'])[2]");
        public static By p2_price = By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div");
        public static By p2_cart = By.xpath("(//DIV[@class='inventory_item_desc'])[2]");

        public static By p3_name = By.xpath("//DIV[@class='inventory_item_name '][text()='Sauce Labs Bolt T-Shirt']");
        public static By p3_des = By.xpath("//DIV[@class='inventory_item_desc'][text()='Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.']");
        public static By p3_price = By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[3]/div[2]/div[2]/div");
        public static By p3_cart = By.xpath("//BUTTON[@id='add-to-cart-sauce-labs-bolt-t-shirt']");

        public static By p4_name = By.xpath("//DIV[@class='inventory_item_name '][text()='Sauce Labs Fleece Jacket']");
        public static By p4_des = By.xpath("(//DIV[@class='inventory_item_desc'])[4]");
        public static By p4_price = By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[4]/div[2]/div[2]/div");
        public static By p4_cart = By.xpath("//BUTTON[@id='add-to-cart-sauce-labs-fleece-jacket']");

        public static By p5_name = By.xpath("//DIV[@class='inventory_item_name '][text()='Sauce Labs Onesie']");
        public static By p5_des = By.xpath("(//DIV[@class='inventory_item_desc'])[5]");
        public static By p5_price = By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[5]/div[2]/div[2]/div");
        public static By p5_cart = By.xpath("//BUTTON[@id='add-to-cart-sauce-labs-onesie']");

        public static By p6_name = By.xpath("//DIV[@class='inventory_item_name '][text()='Test.allTheThings() T-Shirt (Red)']");
        public static By p6_des = By.xpath("//DIV[@class='inventory_item_desc'][text()='This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.']");
        public static By p6_price = By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[6]/div[2]/div[2]/div");
        public static By p6_cart = By.xpath("//BUTTON[@id='add-to-cart-test.allthethings()-t-shirt-(red)']");
    }

    public static class UIElements{
        public static String p4_name = "Sauce Labs Backpack";
        public static String p4_des = "It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.";

        public static String p5_name = "Sauce Labs Onesie";
        public static String p5_des = "Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.";
    }
}
