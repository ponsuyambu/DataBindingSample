package in.ponshere.androiddatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import in.ponshere.androiddatabinding.databinding.ActivitySampleBinding;

public class SampleBindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivitySampleBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_sample);
        final User user = new User("Ponsuyambu", "Velladurai");
        binding.setUser(user);
    }
}
