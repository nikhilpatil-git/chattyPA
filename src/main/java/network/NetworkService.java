package network;

/**
 * Created by deadcode on 18/12/2016.
 */
public interface NetworkService {

    public void executeGetRequest(String url, NetworkJsonNodeCallback networkJsonNodeCallback);
}
