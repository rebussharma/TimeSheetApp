package common.dto;

import java.util.List;

/**
 * Created by Asus on 6/16/2018.
 */
public class ResponseDto<T> {
    private boolean success;
    private String message;
    private List<T> datas;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<T> getDatas() {
        return datas;
    }

    public void setDatas(List<T> datas) {
        this.datas = datas;
    }
}
