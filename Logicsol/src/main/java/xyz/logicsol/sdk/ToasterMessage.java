package xyz.logicsol.sdk;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    public static void c(Context c, String m){
        Toast.makeText(c, m, Toast.LENGTH_SHORT).show();
    }

}
