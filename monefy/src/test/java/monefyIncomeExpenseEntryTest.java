import environment.mobileEnvironment;
import keyword.monefyKeyword;
import org.testng.annotations.Test;

public class monefyIncomeExpenseEntryTest extends mobileEnvironment {

    private monefyKeyword monefyKeyword;

    //monefyIncomeExpenseEntryTest.testMonefyIncomeExpenseEntry.csv
    @Test(dataProvider = "DefaultProvider")
    public void testMonefyIncomeExpenseEntry(String caseId, String description,String entryType,int date, String value, String category){
     monefyKeyword = new monefyKeyword(driver, log);
     monefyKeyword.openMonefy();
     monefyKeyword.openNavigation();
     monefyKeyword.openDatePicker();
     monefyKeyword.setDate(date);
     monefyKeyword.getEntryDetails();
     monefyKeyword.addEntry(entryType);
     monefyKeyword.openViewDate();
     monefyKeyword.setDate(date);
     monefyKeyword.pressCalculator(value);
     monefyKeyword.proceedToChooseCategory();
     monefyKeyword.selectCategory(category);
     monefyKeyword.openNavigation();
     monefyKeyword.openDatePicker();
     monefyKeyword.setDate(date);
     monefyKeyword.validateEntryAmount(entryType,value);
     monefyKeyword.getEntryDetails();
     monefyKeyword.validateBalance();
     monefyKeyword.closeMonefy();
    }
}
