package app.housenow.com.housenow.manager;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Jorge on 14/11/2017.
 */

public class SessionManager {

    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private static final String PREF_NAME = "Miapptest";
    private Context _context;
    private int PRIVATE_MODE = 0;
    private String KEY_USER = "user";

    public SessionManager(Context context) {
        _context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public void saveUser(String username) {
        editor.putString(KEY_USER, username);
        editor.commit();
    }
    public String getUserName() {
        return pref.getString(KEY_USER, null);
    }
}

