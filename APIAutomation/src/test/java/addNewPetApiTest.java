import core.base.BaseTestCase;
import org.testng.annotations.Test;
import service.AddNewPetApi;

public class addNewPetApiTest extends BaseTestCase {
    private AddNewPetApi addNewPetApi;
    //addNewPetApiTest.testAddNewPetApi.csv
    @Test(dataProvider = "DefaultProvider")
    public void testAddNewPetApi(String caseId, String description){
        addNewPetApi = new AddNewPetApi();
        addNewPetApi.sendRequest(13);
    }
}
