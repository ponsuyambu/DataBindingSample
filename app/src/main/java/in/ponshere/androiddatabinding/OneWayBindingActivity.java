package in.ponshere.androiddatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import in.ponshere.androiddatabinding.databinding.ActivityOnewayBindingBinding;

public class OneWayBindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityOnewayBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_oneway_binding);
        final User user = new User("Ponsuyambu", "Velladurai");
        binding.setUser(user);

        binding.btnBinding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.firstName = "Pons";
                binding.setUser(user);
            }
        });
    }
}
