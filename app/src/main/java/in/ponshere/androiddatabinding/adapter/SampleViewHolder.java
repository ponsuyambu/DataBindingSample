package in.ponshere.androiddatabinding.adapter;

import android.support.v7.widget.RecyclerView;

import in.ponshere.androiddatabinding.BR;
import in.ponshere.androiddatabinding.databinding.RowItemBinding;

/**
 * @author Ponsuyambu
 * @since 9/5/17.
 */

public class SampleViewHolder extends RecyclerView.ViewHolder {
    private final RowItemBinding binding;

    public SampleViewHolder(RowItemBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(RowItemViewModel viewModel) {
        binding.setVariable(BR.rowItemViewModel, viewModel);
        binding.executePendingBindings();
    }
}
