package in.ponshere.androiddatabinding.adapter;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;

import in.ponshere.androiddatabinding.R;
import in.ponshere.androiddatabinding.databinding.AdapterActivityBinding;

/**
 * @author Ponsuyambu
 * @since 9/5/17.
 */

public class SampleAdapterBindingActivity extends AppCompatActivity{

    AdapterActivityBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.adapter_activity);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<String> data = new ArrayList<>();
        data.add("1");
        data.add("2");
        data.add("3");
        data.add("4");
        data.add("5");
        data.add("6");
        data.add("7");
        data.add("8");
        data.add("9");
        data.add("10");
        data.add("11");
        data.add("12");
        binding.recyclerView.setAdapter(new SampleAdapter(data));

    }
}
