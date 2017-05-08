package in.ponshere.androiddatabinding.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import in.ponshere.androiddatabinding.R;

/**
 * @author Ponsuyambu
 * @since 9/5/17.
 */

public class SampleFragmentViewBindingActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setContentView(this, R.layout.fragment_binding_activity);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentPlaceHolder,new SampleFragment()).commit();
    }
}
