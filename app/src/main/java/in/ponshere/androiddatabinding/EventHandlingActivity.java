package in.ponshere.androiddatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import in.ponshere.androiddatabinding.databinding.ActivityEventHandlingBinding;

public class EventHandlingActivity extends AppCompatActivity {
    ActivityEventHandlingBinding binding;
    User user = new User("Ponsuyambu", "Velladurai");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_event_handling);
        binding.setUser(user);
        binding.setMethodRef(this);
        binding.setPresenter(new EventHandlingPresenter());


    }

    public void onSave1Clicked(View view){
        Toast.makeText(this, "Save 1 button clicked -  "+user.firstName, Toast.LENGTH_SHORT).show();
    }


}
