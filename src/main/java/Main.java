import com.cyy.demo.Server.WebSocketServer;

public class Main {

    public static void main(String[] args) {
        new WebSocketServer("192.168.3.222",9999).start();
    }
}
