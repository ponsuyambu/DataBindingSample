package in.ponshere.androiddatabinding.observable;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import in.ponshere.androiddatabinding.R;
import in.ponshere.androiddatabinding.databinding.ActivityObservableBinding;

public class SampleObservableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Observable Fields");
        final ActivityObservableBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_observable);
        final User user = new User("Ponsuyambu", "Velladurai");
        binding.setUser(user);

        binding.btnChange.setVisibility(View.VISIBLE);
        binding.btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.firstName.set("Changed!");
            }
        });

    }
}
