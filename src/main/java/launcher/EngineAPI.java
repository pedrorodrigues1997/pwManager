package launcher;

import com.mongodb.DB;
import data.User;
import data.userManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EngineAPI {

    private static final Logger LOGGER = LogManager.getLogger(EngineAPI.class);

    public static void start(DB db) { //ALSO RECEIVES GUI ELEMENTS?
        /*while(true){
            //AWAITS INPUT FROM GUI
            //DOES SHIT BASED ON IT
        }*/
        User user = CreateNewUser("Pedro", "12@RP7123", "pedrex1997@gmail.com", "AES128", db);
        DeleteUser(user, db);
    }



    private static User CreateNewUser(String username, String password, String email, String encryptionType, DB db) {
        User newUser = userManager.createNewUser(username, password, email, encryptionType, db);
        return newUser;
    }

    private static boolean DeleteUser(User user, DB db) {
       userManager.deleteUser(user, db);
        return true;
    }

}