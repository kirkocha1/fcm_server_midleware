package routes;

import buildcomponents.HttpMethodType;
import buildcomponents.RoutePathHolder;
import spark.Route;
import spark.Spark;

import java.util.HashMap;
import java.util.Map;

public class AppRouter {


    private Map<RoutePathHolder, Route> appRoutes = new HashMap<>();

    public void initAppRoutes() {

        appRoutes.put(new RoutePathHolder(SendFcmRoute.SEND_FCM_MESSAGE, HttpMethodType.POST), new SendFcmRoute());
    }

    public void register() {
        appRoutes.forEach((pathHandler, route) -> {
            switch (pathHandler.getType()) {
                case POST:
                    Spark.post(pathHandler.getPath(), route);
                    break;
                case GET:
                    Spark.get(pathHandler.getPath(), route);
                    break;
            }
        });
    }

}
