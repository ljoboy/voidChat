
package utilitez;

/**
 * ClassName : notification.java 
 * @author MotYim
 * @version 1.0
 * @since 9-2-2017
 */
public interface Notification {
    
    public final static int ACCEPT_FRIEND_REQUEST = 0;
    public final static int FRIEND_ONLINE = 1;
    public final static int FRIEND_OFFLINE = 2;
    public final static int FRIEND_REQUSET = 3;
    public final static int SERVER_MESSAGE = 4;
    
    /**
     * send notification 
     * @param reciver
     * @param message
     * @param type 
     */
    void notify(String reciver , String message , int type) throws Exception;
}
