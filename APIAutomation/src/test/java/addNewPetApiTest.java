import core.base.BaseTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.testng.annotations.Test;
import service.AddNewPetApi;
@Component
public class addNewPetApiTest extends BaseTestCase {

    private AddNewPetApi addNewPetApi;
    //addNewPetApiTest.testAddNewPetApi.csv
    @Test(dataProvider = "DefaultProvider")
    public void testAddNewPetApi(String caseId, String description){
        addNewPetApi = new AddNewPetApi();
        addNewPetApi.sendRequest(13);
    }
}
