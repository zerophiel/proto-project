package infrastructure.performance.protoproject.dto;

public class ProtoRequest extends BaseRequest {
    public ProtoRequestParams params;
    public ProtoRequest(String apiVersion, String id, String method, ProtoRequestParams params) {
        super(apiVersion,id,method);
        this.params = params;
    }
}
