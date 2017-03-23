/**
 * Created by bilaizi on 17-3-23.
 */
module org.fastsocket {
    requires com.socket;
    provides com.socket.spi.NetworkSocketProvider
            with org.fastsocket.FastNetworkSocketProvider;
}