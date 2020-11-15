package pages;

import io.appium.java_client.android.AndroidDriver;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class monefyPage extends baseMobilePageObject<monefyPage> {

    protected monefyPage(AndroidDriver driver, Logger log) {
        super(driver, log);
    }
    protected By pieGraphImage = By.id("com.monefy.app.lite:id/piegraph");
    protected By rightLinesButton = By.id("com.monefy.app.lite:id/rightLinesImageView");
    protected By leftLinesButton = By.id("com.monefy.app.lite:id/leftLinesImageView");
    public By entryAmountLabel(String entryType){
        return By.id("com.monefy.app.lite:id/"+entryType+"_amount_text");
    }
    protected By balanaceAmountLabel = By.id("com.monefy.app.lite:id/balance_amount");
    protected By sortButton = By.id("com.monefy.app.lite:id/buttonChooseListSortingMode");
    public By perDateEntryLabel(int index){
        return By.xpath("//android.widget.RelativeLayout[@resource-id=\"com.monefy.app.lite:id/transaction_group_header\"][1]//following-sibling::android.widget.LinearLayout["+index+"]//child::android.widget.TextView[@resource-id=\"com.monefy.app.lite:id/textViewCategoryName\"]");
    }
    public By perCategoryEntryLabel(int index){
        return By.xpath("//android.widget.RelativeLayout[@resource-id=\"com.monefy.app.lite:id/transaction_group_header\"]["+index+"]//android.widget.TextView[@resource-id=\"com.monefy.app.lite:id/textViewCategoryName\"]");
    }
    public By categoryButton(String category){
        return By.id("com.monefy.app.lite:id/"+category+"_button");
    }
    protected By openNavigationButton = By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation\"]");
    public By periodButton(String period){
        return By.id("com.monefy.app.lite:id/"+period+"_period_button");
    }
    protected By datePickerButton = By.id("com.monefy.app.lite:id/show_datepicker_button");
    protected By selectAccountDropDown = By.id("com.monefy.app.lite:id/account_spinner");
    public By selectAccountType(String accountName, String AccountCurrency){
        return By.xpath("//android.widget.TextView[@resource-id=\"com.monefy.app.lite:id/title\" and @text[normalize-space()=\""+accountName+"\"]]//following-sibling::android.widget.TextView[@resource-id=\"com.monefy.app.lite:id/currency_name\" and @text[normalize-space()=\""+AccountCurrency+"\"]]//parent::android.widget.LinearLayout");
    }
    protected By keyboardLayout = By.id("com.monefy.app.lite:id/linearLayoutKeyboard");
    public By calculatorKeyboardButton(String button){
        return By.id("com.monefy.app.lite:id/buttonKeyboard"+button+"");
    }
    protected By viewDateLinkText = By.id("com.monefy.app.lite:id/textViewDate");
    protected By editCalenderButton = By.id("com.monefy.app.lite:id/mtrl_picker_header_toggle");
    protected By editDateTextBox = By.xpath("//android.widget.EditText");
    protected By editDateOkButton = By.id("com.monefy.app.lite:id/confirm_button");
    protected By editDateCancelButton = By.id("com.monefy.app.lite:id/cancel_button");
    protected By chooseCategoryButton = By.id("com.monefy.app.lite:id/keyboard_action_button");
    protected By viewNoteTextBox = By.id("com.monefy.app.lite:id/textViewNote");
    protected By amountTextBox = By.id("com.monefy.app.lite:id/amount_text");
    public By expenseCategoryButton(String category){
        return By.xpath("//android.widget.TextView[@resource-id=\"com.monefy.app.lite:id/textCategoryName\" and @text[normalize-space()=\""+category+"\"]]//parent::android.widget.LinearLayout");
    }

}

