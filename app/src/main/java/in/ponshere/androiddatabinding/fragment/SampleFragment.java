package in.ponshere.androiddatabinding.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.ponshere.androiddatabinding.R;
import in.ponshere.androiddatabinding.databinding.FragmentSampleBinding;

/**
 * @author Ponsuyambu
 * @since 9/5/17.
 */

public class SampleFragment extends Fragment {

    FragmentSampleBinding binding;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sample,container,false);
        return binding.getRoot();
    }
}
