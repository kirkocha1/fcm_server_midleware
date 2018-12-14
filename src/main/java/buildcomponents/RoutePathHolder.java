package buildcomponents;

public class RoutePathHolder {

    private String path;

    private HttpMethodType type;

    public RoutePathHolder(String path, HttpMethodType type) {
        this.path = path;
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public HttpMethodType getType() {
        return type;
    }
}
