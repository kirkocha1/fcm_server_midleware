package domain.models;

import com.google.gson.annotations.SerializedName;

public class MessageToSend {


    @SerializedName("payload")
    private String payload;

    public String getPayload() {
        return payload;
    }
}
