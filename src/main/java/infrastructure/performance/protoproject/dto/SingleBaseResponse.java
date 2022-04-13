package infrastructure.performance.protoproject.dto;


public class SingleBaseResponse<T> extends BaseResponse {

    private T data;
    private String uuid;

    public SingleBaseResponse() {
    }

    public SingleBaseResponse(String apiVersion, String uuid,String method, T data) {
        super(apiVersion,method);
        this.uuid = uuid;
        this.data = data;
    }

    public String getUuid() {
        return uuid;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "SingleBaseResponse{" +
                "uuid='" + uuid + '\'' +
                ", data=" + data +
                '}';
    }
}
