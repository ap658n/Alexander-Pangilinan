import environment.mobileEnvironment;
import keyword.monefyKeyword;
import org.testng.annotations.Test;

public class monefyValidateBalanceTest extends mobileEnvironment {

    private monefyKeyword monefyKeyword;

    //monefyValidateBalanceTest.testBalance.csv
    @Test(dataProvider = "DefaultProvider")
    public void testBalance(String caseId, String description,String period){
        monefyKeyword = new monefyKeyword(driver, log);
        monefyKeyword.openMonefy();
        monefyKeyword.openNavigation();
        monefyKeyword.selectPeriod(period);
        monefyKeyword.getEntryDetails();
        monefyKeyword.validateBalance();
        monefyKeyword.closeMonefy();
    }
}
