package infrastructure.performance.protoproject.dto;

import java.io.Serializable;

public class BaseResponse implements Serializable {

    private String apiVersion;
    private String method;


    public BaseResponse(String apiVersion, String method) {
        this.apiVersion = apiVersion;
        this.method = method;
    }

    public BaseResponse() {
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "apiVersion='" + apiVersion + '\'' +
                ", method=" + method +
                '}';
    }
}
