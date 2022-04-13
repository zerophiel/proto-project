package infrastructure.performance.protoproject.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ProtoRequestParams {
    public int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
