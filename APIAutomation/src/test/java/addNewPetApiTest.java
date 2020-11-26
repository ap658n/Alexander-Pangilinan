import core.base.BaseTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;
import core.service.AddNewPetApi;


public class addNewPetApiTest extends BaseTestCase {
    @Autowired
    private AddNewPetApi addNewPetApi;

    @Test(dataProvider = "DefaultProvider")
    public void testAddNewPetApi(String caseId, String description) {
        addNewPetApi.sendRequest(13);
    }
}
