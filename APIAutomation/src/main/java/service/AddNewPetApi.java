package service;

import com.alibaba.fastjson.JSONObject;
import core.base.BaseResfulApiService;
import core.base.model.ResfulApiRequestModel;
import helpers.commonHelper;
import org.springframework.stereotype.Service;

@Service
public class AddNewPetApi extends BaseResfulApiService {
    private static final String API_FUNCTION = "api.v3.pet";
    private static final String hostURL = "PETSTORE_HOST";

    public JSONObject sendRequest(int id) {
        ResfulApiRequestModel resfulApiRequestModel = new ResfulApiRequestModel();
        resfulApiRequestModel.setHostURL(hostURL);
        resfulApiRequestModel.setFunction(API_FUNCTION);
        resfulApiRequestModel.setBodyWriteInt("id", id);
        resfulApiRequestModel.setBodyRewrite("name", "pet"+commonHelper.generateTime("YYMMddhhmmss"));
        return sendResfulApiRequest(resfulApiRequestModel);
    }


    public void check() {

    }


}
