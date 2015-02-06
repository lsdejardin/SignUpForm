package ellesse.signupform;

import android.util.Log;

/**
 * Created by lsdejardin on 06/02/15.
 */
public class User {

    private final static String TAG="User";
    private String mUsername;
    private String mPassword;

    User(String username,String password){
        this.mUsername=username;
        this.mPassword=password;
        //Log.d(TAG,String.format("User %$1s created with password %$2s.",mUsername,mPassword));
        Log.d(TAG,"User "+mUsername+" created with password "+mPassword+".");
    }


}
