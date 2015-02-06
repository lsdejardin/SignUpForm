package ellesse.signupform;

import android.util.Log;

import java.io.Serializable;

/**
 * Created by lsdejardin on 06/02/15.
 */
public class User implements Serializable{

    private final static String TAG="User";
    private String mUsername;
    private String mPassword;

    User(String username,String password){
        this.mUsername=username;
        this.mPassword=password;
        Log.d(TAG,String.format("User %1$s created with password %2$s.",mUsername,mPassword));
    }

    public String getUsername(){
        return mUsername;
    }


}
