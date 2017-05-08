package in.ponshere.androiddatabinding;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import in.ponshere.androiddatabinding.adapter.SampleAdapterBindingActivity;
import in.ponshere.androiddatabinding.counter.CounterActivity;
import in.ponshere.androiddatabinding.databinding.ActivityMainBinding;
import in.ponshere.androiddatabinding.fragment.SampleFragmentViewBindingActivity;
import in.ponshere.androiddatabinding.observable.SampleObservableActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setHandler(this);
    }

    public void onBasicClicked(View view){
        startActivity(new Intent(this,SampleBindingActivity.class));
    }

    public void onEventHandlingClicked(View view){
        startActivity(new Intent(this,EventHandlingActivity.class));
    }

    public void onFieldBindingClicked(View view){
        startActivity(new Intent(this,CounterActivity.class));
    }

    public void onObservableClicked(View view){
        startActivity(new Intent(this,SampleObservableActivity.class));
    }

    public void onFragmetSampleClicked(View view){
        startActivity(new Intent(this,SampleFragmentViewBindingActivity.class));
    }
    public void onAdapterSampleClicked(View view){
        startActivity(new Intent(this,SampleAdapterBindingActivity.class));
    }
}
