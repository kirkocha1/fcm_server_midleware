package routes;

import com.google.gson.Gson;
import domain.models.MessageToSend;
import org.eclipse.jetty.client.HttpClient;
import spark.Request;
import spark.Response;
import spark.Route;


public class SendFcmRoute implements Route {

    static String SEND_FCM_MESSAGE = "send";

    private Gson gson = new Gson();

    @Override
    public Object handle(Request request, Response response) throws Exception {
        var message = gson.fromJson(request.body(), MessageToSend.class);
        var client = new HttpClient();
        return message.getPayload();
    }


}
