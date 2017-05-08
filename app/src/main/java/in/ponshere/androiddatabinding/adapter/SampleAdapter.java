package in.ponshere.androiddatabinding.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import in.ponshere.androiddatabinding.R;
import in.ponshere.androiddatabinding.databinding.RowItemBinding;

/**
 * @author Ponsuyambu
 * @since 9/5/17.
 */

public class SampleAdapter extends RecyclerView.Adapter<SampleViewHolder> {

    List<String> originalData;
    List<RowItemViewModel> viewModelData;

    public SampleAdapter(ArrayList<String> data){
        originalData = data;
        viewModelData = new ArrayList<>();
        convertDataToViewModelData();
    }

    private void convertDataToViewModelData() {
        for(String s : originalData){
            RowItemViewModel viewModel = new RowItemViewModel(s);
            viewModelData.add(viewModel);
        }
    }

    @Override
    public SampleViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RowItemBinding viewDataBinding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.row_item, viewGroup, false);
        return new SampleViewHolder(viewDataBinding);
    }



    @Override
    public int getItemCount() {
        return viewModelData.size();
    }

    @Override
    public void onBindViewHolder(SampleViewHolder customViewHolder, int i) {
        customViewHolder.bind(viewModelData.get(i));
    }


}
