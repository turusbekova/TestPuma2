package puma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class CartTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://us.puma.com");
    }

    @Test
    public void addToCartTest() {

        WebElement shoesCategory = driver.findElement(By.xpath("//a[@href='/us/en/shoes']"));
        shoesCategory.click();
        WebElement product = driver.findElement(By.xpath("//a[@title='PUMA x First Mile LQDCELL Optic Shoes']"));
        product.click();
        WebElement addToCartButton = driver.findElement(By.xpath("//button[@data-test='add-to-cart']"));
        addToCartButton.click();
        WebElement cartQuantity = driver.findElement(By.xpath("//span[@class='cart-quantity']"));
        Assert.assertEquals(cartQuantity.getText(), "1");
        WebElement cartItemName = driver.findElement(By.xpath("//a[@class='cart-item-name-link']"));
        Assert.assertEquals(cartItemName.getText(), "PUMA x First Mile LQDCELL Optic Shoes");
        WebElement cartItemPrice = driver.findElement(By.xpath("//span[@class='cart-item-price']"));
        Assert.assertEquals(cartItemPrice.getText(), "$100.00");
    }

    @Test
    public void updateCartItemTest() {
        WebElement cartIcon = driver.findElement(By.xpath("//span[@class='cart-icon']"));
        cartIcon.click();
        WebElement cartQuantity = driver.findElement(By.xpath("//input[@class='cart-item-quantity']"));
        cartQuantity.clear();
        cartQuantity.sendKeys("2");
        WebElement updateButton = driver.findElement(By.xpath("//button[@data-test='update-cart']"));
        updateButton.click();
        WebElement cartItemQuantity = driver.findElement(By.xpath("//input[@class='cart-item-quantity']"));
        Assert.assertEquals(cartItemQuantity.getAttribute("value"), "2");
        WebElement cartItemPrice = driver.findElement(By.xpath("//span[@class='cart-item-price']"));
        Assert.assertEquals(cartItemPrice.getText(), "$200.00");
        WebElement cartSubtotal = driver.findElement(By.xpath("//span[@class='cart-subtotal-price']"));
        Assert.assertEquals(cartSubtotal.getText(), "$200.00");
    }

    @Test
    public void removeItemFromCart() {
        WebElement product = driver.findElement(By.xpath("//a[@title='PUMA x First Mile LQDCELL Optic Shoes']"));
        product.click();
        WebElement addToCartButton = driver.findElement(By.xpath("//button[@data-test='add-to-cart']"));
        addToCartButton.click();
        WebElement cartIcon = driver.findElement(By.xpath("//span[@class='cart-icon']"));
        cartIcon.click();
        WebElement removeButton = driver.findElement(By.xpath("//button[@data-test='remove-cart']"));
        removeButton.click();
        WebElement emptyCartMessage = driver.findElement(By.xpath("//div[@class='cart-empty-message']"));
        Assert.assertEquals(emptyCartMessage.getText(), "Your cart is empty.");
        WebElement cartQuantity = driver.findElement(By.xpath("//span[@class='cart-quantity']"));
        Assert.assertEquals(cartQuantity.getText(), "0");
    }

    @Test
    public void applyPromoCode() {
        WebElement product = driver.findElement(By.xpath("//a[@title='PUMA x First Mile LQDCELL Optic Shoes']"));
        product.click();
        WebElement addToCartButton = driver.findElement(By.xpath("//button[@data-test='add-to-cart']"));
        addToCartButton.click();
        WebElement cartIcon = driver.findElement(By.xpath("//span[@class='cart-icon']"));
        cartIcon.click();
        WebElement promoCodeInput = driver.findElement(By.xpath("//input[@data-test='promo-code-input']"));
        promoCodeInput.sendKeys("CODE123");
        WebElement applyButton = driver.findElement(By.xpath("//button[@data-test='apply-promo-code']"));
        applyButton.click();
        WebElement promoCodeSuccessMessage = driver.findElement(By.xpath("//div[@data-test='promo-code-success']"));
        Assert.assertEquals(promoCodeSuccessMessage.getText(), "Promo code CODE123 was applied.");
        WebElement orderTotal = driver.findElement(By.xpath("//span[@data-test='order-total']"));
        Assert.assertEquals(orderTotal.getText(), "$135.00");


        driver.quit();
    }

}







