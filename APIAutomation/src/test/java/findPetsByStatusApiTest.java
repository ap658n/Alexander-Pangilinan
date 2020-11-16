import core.base.BaseTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.testng.annotations.Test;
import service.FindPetsByStatusApi;

@Component
public class findPetsByStatusApiTest extends BaseTestCase {
    private FindPetsByStatusApi findPetsByStatusApi;
//findPetsByStatusApiTest.testFindPetsByStatus.csv
    @Test(dataProvider = "DefaultProvider")
    public void testFindPetsByStatus(String caseId, String description, String status){
        findPetsByStatusApi = new FindPetsByStatusApi();
        findPetsByStatusApi.sendRequest(status);
    }
}
