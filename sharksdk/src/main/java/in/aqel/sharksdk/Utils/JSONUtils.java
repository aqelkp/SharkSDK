package in.aqel.sharksdk.Utils;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Ahammad on 02/12/15.
 */
public class JSONUtils {

    public static String loadJSONFromAsset(Context context, String file) {
        String json = null;
        try {

            InputStream is = context.getAssets().open(file);

            int size = is.available();

            byte[] buffer = new byte[size];

            is.read(buffer);

            is.close();

            json = new String(buffer, "UTF-8");


        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;

    }

}
