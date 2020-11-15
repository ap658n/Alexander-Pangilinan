package keyword;

import commonFunctions.commonHelper;
import commonFunctions.mapHelper;
import io.appium.java_client.android.AndroidDriver;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import pages.monefyPage;

import java.text.DecimalFormat;

public class monefyKeyword extends monefyPage {
    private String generatedTime;
    private String incomeValue;
    private String expenseValue;
    private String balanceValue;
    private DecimalFormat decimalFormat;

    public monefyKeyword(AndroidDriver driver, Logger log) {
        super(driver, log);
    }

    public void openMonefy() {
        log.info("Open monefy application");
        activateApp("com.monefy.app.lite");
        refreshApp();
        waitForElementToBeVisible(pieGraphImage,1000);
    }

    public void closeMonefy() {
        log.info("Close monefy application");
        terminateApp("com.monefy.app.lite");
    }
    public void getEntryDetails(){
        log.info("Get entry details.");
        verifyObjectExist(entryAmountLabel(mapHelper.mapEntry("income")), 1000);
        incomeValue = getText(entryAmountLabel(mapHelper.mapEntry("income"))).replaceAll("₱|,", "").trim();
        expenseValue = getText(entryAmountLabel(mapHelper.mapEntry("expense"))).replaceAll("₱|,", "").trim();
    }
    public void validateBalance(){
        log.info("Get balance details.");
        verifyObjectExist(balanaceAmountLabel, 1000);
        String[] arr = getText(balanaceAmountLabel).split("₱");
        balanceValue = arr[1].replaceAll(",","").trim();
        float balanceVal = Float.parseFloat(balanceValue);
        decimalFormat = new DecimalFormat("#.##");
        float income = Float.parseFloat(incomeValue);
        float expense = Float.parseFloat(expenseValue);
        String Total = decimalFormat.format(Math.abs(income-expense));
        Assert.assertEquals(decimalFormat.format(balanceVal),Total);
        log.info("Total income details: "+incomeValue);
        log.info("Total expense details: "+expenseValue);
        log.info("Total balance details: "+balanceValue);
    }
    public void validateEntryAmount(String entryType, String addedAmount){
        log.info("Validate entry amount details.");
        String currentValue;
        if(mapHelper.mapEntry(entryType).equals("income")) {
            currentValue = incomeValue;
        }else {
            currentValue = expenseValue;
        }
        verifyObjectExist(entryAmountLabel(mapHelper.mapEntry(entryType)), 1000);
        float newBalance = Float.parseFloat(getText(entryAmountLabel(mapHelper.mapEntry(entryType))).replaceAll("₱", "").trim());
        decimalFormat = new DecimalFormat("#.##");
        float currentVal = Float.parseFloat(currentValue);
        float Amount = Float.parseFloat(addedAmount);
        String Total = decimalFormat.format(currentVal+Amount);
        Assert.assertEquals(decimalFormat.format(newBalance),Total);
        log.info("Previous "+entryType+" details: "+currentValue);
        log.info("Latest "+entryType+" details: "+decimalFormat.format(newBalance));
    }
    public void openNavigation() {
        log.info("Open navigation menu.");
        verifyObjectExist(openNavigationButton, 1000);
        click(openNavigationButton);
    }
    public void selectPeriod(String period){
        log.info("Select "+period+" period.");
        verifyObjectExist(periodButton(mapHelper.mapPeriod(period)), 1000);
        click(periodButton(mapHelper.mapPeriod(period)));
        waitForElementToBeVisible(pieGraphImage,1000);
    }

    public void selectAccount(String accountName, String accountCurrency){
        log.info("Select account "+accountName+ " with currency "+accountCurrency);
        verifyObjectExist(selectAccountDropDown, 1000);
        click(selectAccountDropDown);
        verifyObjectExist(selectAccountType(accountName,accountCurrency),1000);
        click(selectAccountType(accountName,accountCurrency));
    }

    public void openDatePicker(){
        log.info("Open calendar");
        waitForElementToBeVisible(datePickerButton,1000);
        click(datePickerButton);
    }

    public void openViewDate(){
        log.info("Open calendar");
        waitForElementToBeVisible(viewDateLinkText,1000);
        click(viewDateLinkText);
    }
    public void setDate(String date){
        String Date = date.isEmpty()==true?commonHelper.generateTime("MM/dd/YY"):date;
        waitForElementToBeVisible(editCalenderButton, 1000);
        log.info("Edit calendar date.");
        click(editCalenderButton);
        waitForElementToBeVisible(editDateTextBox,1000);
        clear(editDateTextBox);
        log.info("Set date to "+Date);
        type(Date,editDateTextBox);
        click(editCalenderButton);
        click(editDateOkButton);
    }
    public void setDate(int date){
        String Date = commonHelper.getDateString(date,"MM/dd/YY");
        waitForElementToBeVisible(editCalenderButton, 1000);
        log.info("Edit calendar date.");
        click(editCalenderButton);
        waitForElementToBeVisible(editDateTextBox,1000);
        clear(editDateTextBox);
        log.info("Set date to "+Date);
        type(Date,editDateTextBox);
        click(editCalenderButton);
        click(editDateOkButton);
    }
    public void addEntry(String category) {
        log.info("Add " + category);
        verifyObjectExist(categoryButton(category), 1000);
        click(categoryButton(category));
    }
    public void pressCalculator(String value) {
        log.info("Add value "+value);
        waitForPresenceOfText(amountTextBox,"0",1000);
        boolean pressEquals = false;
        int x = 1;
        String operator = null;
        for (char val : value.toCharArray()) {
            if (Character.isLetter(val)) {
                if (x < value.length()) {
                    if (operator == null) {
                        operator = String.valueOf(val);
                    } else {
                        operator += "" + val;
                    }
                } else {
                    operator += "" + val;
                    log.info("Press "+operator);
                    click(calculatorKeyboardButton(operator));
                }
            } else {
                if (operator != null) {
                    log.info("Press "+operator);
                    click(calculatorKeyboardButton(operator));
                    pressEquals = true;
                    operator = null;
                }
                log.info("Press "+val);
                click(calculatorKeyboardButton(String.valueOf(val)));

            }
            x++;

        }
        if (pressEquals==true){
            log.info("Press Equals");
            click(calculatorKeyboardButton("Equals"));
        }

    }
    public void clearAmount(){
        log.info("Clear amount");
        click(calculatorKeyboardButton("Clear"));
    }
    public void proceedToChooseCategory(){
        log.info("Proceed to choose category.");
        click(chooseCategoryButton);
    }
    public void selectCategory(String category){
        log.info("Select "+category+" as income/expense category.");
        waitForElementToBeVisible(expenseCategoryButton(mapHelper.mapCategory(category)),1000);
        click(expenseCategoryButton(mapHelper.mapCategory(category)));
        waitForElementToBeVisible(pieGraphImage,1000);
    }
    public void generateTime() {
        generatedTime = commonHelper.generateTime("YYYYMMddhhmmss");
    }

    public String getTime() {
        return generatedTime;
    }


}
