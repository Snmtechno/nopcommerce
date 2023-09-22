package Elements;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PrElement extends Parents {

    public PrElement() {
        PageFactory.initElements(BaseDriver.driver, this);

    }

    @FindBy(xpath = "//a[@class='ico-login']")
    public WebElement loginButton;
    @FindBy(xpath = "//a[@class='ico-register']")
    public WebElement regButton;
    @FindBy(css = "[id='Email']")
    public WebElement loginEmail;
    @FindBy(css = "[id='Password']")
    public WebElement loginPassword;
    @FindBy(xpath = "//button[@class='button-1 login-button']")
    public WebElement log_inButton;
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    public WebElement loginErrorMsg;
    @FindBy(xpath = "//a[@class='ico-account']")
    public WebElement myAccButton;

    @FindBy(xpath = "//div[@class='header-menu']")
    public List<WebElement> listheader;
    @FindBy(xpath = "//ul[@class='sublist first-level']")
    public List<WebElement> subtabs;
    @FindBy(xpath = "//div[@class='header-menu']")
    public WebElement headerMenu;
    @FindBy(xpath = "//*[text()='Computers ']")
    public WebElement computers;
    @FindBy(xpath = "//a[text()='Desktops ']")
    public WebElement desktop;
    @FindBy(xpath = " //a[text()='Notebooks ']")
    public WebElement notebooks;
    @FindBy(xpath = " //a[text()='Software ']")
    public WebElement software;
    @FindBy(linkText = "Electronics")
    public WebElement electronics;
    @FindBy(xpath = " //a[text()='Camera & photo ']")
    public WebElement cameraAndPhoto;
    @FindBy(xpath = " //a[text()='Cell phones ']")
    public WebElement cellPhone;
    @FindBy(xpath = " //a[text()='Others ']")
    public WebElement others;
    @FindBy(xpath = "//*[text()='Apparel ']")
    public WebElement apparel;
    @FindBy(xpath = " //a[text()='Shoes ']")
    public WebElement shoes;
    @FindBy(xpath = " //a[text()='Clothing ']")
    public WebElement clothing;
    @FindBy(xpath = " //a[text()='Accessories ']")
    public WebElement accessories;

    @FindBy(xpath = "//*[text()='Digital downloads ']")
    public WebElement digitalDownloads;
    @FindBy(xpath = "//*[text()='Books ']")
    public WebElement books;
    @FindBy(xpath = "//*[text()='Jewelry ']")
    public WebElement jewelry;
    @FindBy(xpath = "//*[text()='Gift Cards ']")
    public WebElement giftCards;
    @FindBy(id = "small-searchterms")
    public WebElement search;
    @FindBy(xpath = "//h2[@class='product-title']/a")
    public List<WebElement> productTitle;
    @FindBy(xpath = "//div[@class='product-name']")
    public WebElement productName;

    @FindBy(css = ".product-item")
    public List<WebElement> productItems;
    @FindBy(css = ".product-name > h1")
    public WebElement chosenGiftCard;
    @FindBy(css = "#giftcard_43_RecipientName")
    public WebElement recipientName25;
    @FindBy(css = "#giftcard_43_SenderName")
    public WebElement yourName25;
    @FindBy(css = "#giftcard_43_Message")
    public WebElement messageField25;
    @FindBy(css = "#giftcard_43_RecipientEmail")
    public WebElement recipientEmail25;
    @FindBy(css = "#giftcard_43_SenderEmail")
    public WebElement yourEmail25;
    @FindBy(css = "#giftcard_44_RecipientName")
    public WebElement recipientName50;
    @FindBy(css = "#giftcard_44_SenderName")
    public WebElement yourName50;
    @FindBy(css = "#giftcard_44_Message")
    public WebElement messageField50;
    @FindBy(css = "#giftcard_45_RecipientName")
    public WebElement recipientName100;
    @FindBy(css = "#giftcard_45_SenderName")
    public WebElement yourName100;
    @FindBy(css = "#giftcard_45_Message")
    public WebElement messageField100;
    @FindBy(id = "add-to-cart-button-43")
    public WebElement addToCart25;
    @FindBy(id = "add-to-cart-button-44")
    public WebElement addToCart50;
    @FindBy(id = "add-to-cart-button-45")
    public WebElement addToCart100;
    @FindBy(css = ".content")
    public WebElement msg;
    @FindBy(css = "a[href='/gift-cards']")
    public WebElement giftCardsLink;
    @FindBy(xpath = "(//button[@class='button-2 product-box-add-to-cart-button'])[2]")
    public WebElement addToCardsLink;
    @FindBy(css = "p.content")
    public WebElement warningMessage;


    @FindBy(xpath = "(//ul[@class='top-menu notmobile']/li/a)[1]")
    public WebElement computerS;
    @FindBy(xpath = "(//ul[@class='sublist first-level']/li/a)[1]")
    public WebElement desktopS;
    @FindBy(xpath = "(//h2[@class='product-title']/a)[1]")
    public WebElement buildOwnComp;
    @FindBy(xpath = "//select[@id='product_attribute_2']/option[@data-attr-value]")
    public List<WebElement> ramSelectContents;
    @FindBy(xpath = "//input[@name='product_attribute_3']")
    public List<WebElement> hddButtonS;
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    public WebElement BYOC_addToCardButton;
    @FindBy(xpath = "//p[@class='content']")
    public WebElement chckShopCard;

    @FindBy(name = "q")
    public WebElement searchStore;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchButton;
    @FindBy(xpath = "//a[text()='Adobe Photoshop CS4']")
    public WebElement product;

    @FindBy(linkText = "Register")
    public WebElement  register ;
    @FindBy(css = "input[id='gender-male']")
    public WebElement cinsiyet;
    @FindBy(css = "input[id='FirstName']")
    public WebElement firstname;
    @FindBy(css = "input[id='LastName']")
    public WebElement  lastname;
    @FindBy(css = "input[id='Email']")
    public WebElement email  ;
    @FindBy(css = "input[id='Company']")
    public WebElement  company  ;
    @FindBy(css = "input[id='Password']")
    public WebElement password ;
    @FindBy(css = "input[id='ConfirmPassword']")
    public WebElement confirmPassword ;
    @FindBy(css = "button[id='register-button']")
    public WebElement Button ;
    @FindBy(css = "div[class='buttons'] [class='button-1 register-continue-button']")
    public WebElement contine ;
    @FindBy(xpath = "//div[@class='result']")
    public WebElement regMessage;


    public void elementfindersText(WebElement element) {
        hoveraction(element);
        for (WebElement e : subtabs) {
            System.out.println(e.getText());
        }
    }
}