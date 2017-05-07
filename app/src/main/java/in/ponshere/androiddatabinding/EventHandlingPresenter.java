package in.ponshere.androiddatabinding;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 * @author Ponsuyambu
 * @since 7/5/17.
 */

public class EventHandlingPresenter {
    public void onSave2Clicked(View view, Context context, User user){
        Toast.makeText(context, "Save 2 button clicked -  "+user.firstName, Toast.LENGTH_SHORT).show();
    }
}
