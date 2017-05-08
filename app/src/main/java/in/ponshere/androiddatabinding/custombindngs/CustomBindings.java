package in.ponshere.androiddatabinding.custombindngs;

import android.databinding.BindingAdapter;
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * @author Ponsuyambu
 * @since 8/5/17.
 */

public class CustomBindings {
    @BindingAdapter("customFont")
    public static void setFont(TextView view, String fontName){
        Typeface font = Typeface.createFromAsset(view.getContext().getAssets(),fontName+".ttf");
        view.setTypeface(font);
    }
}
