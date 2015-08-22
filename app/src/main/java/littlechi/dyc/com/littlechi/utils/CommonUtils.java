package littlechi.dyc.com.littlechi.utils;

import android.content.res.Resources;
import android.util.TypedValue;

/**
 * Created by Administrator on 2015/6/26.
 */
public class CommonUtils {


    public static int getDementions(int value) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                value, Resources.getSystem().getDisplayMetrics());
    }
}
