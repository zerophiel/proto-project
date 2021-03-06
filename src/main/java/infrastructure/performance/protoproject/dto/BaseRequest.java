package infrastructure.performance.protoproject.dto;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class BaseRequest {
    public String apiVersion;
    public String uuid;
    public String method;
    @JsonCreator
    public BaseRequest (String apiVersion, String uuid, String method) {
        this.apiVersion = apiVersion;
        this.uuid = uuid;
        this.method = method;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
