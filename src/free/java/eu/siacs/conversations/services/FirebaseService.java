package eu.siacs.conversations.services;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

import eu.siacs.conversations.Config;

/**
 * Created by My Computer on 6/9/2017.
 */

public class fcmService  extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {

        String token = FirebaseInstanceId.getInstance().getToken();
       registerToken(token);
    }

    public void registerToken(String token){
        Log.d(Config.LOGC,"Token register "+ token);
    }
}
