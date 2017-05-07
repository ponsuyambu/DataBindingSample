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
        binding.setHandler(this);


    }

    public void onChangeNameClicked(View view){
        user.firstName = "Pons";
        binding.setUser(user);
    }

    public void onSaveClicked(View view,User user){
        Toast.makeText(this, "Save button clicked -  "+user.firstName, Toast.LENGTH_SHORT).show();
    }
}
