package in.ponshere.androiddatabinding.adapter;

import android.databinding.ObservableField;

/**
 * @author Ponsuyambu
 * @since 9/5/17.
 */

public class RowItemViewModel {
    public ObservableField<String> data = new ObservableField<>();


    public RowItemViewModel(String data) {
        setData(data);
    }

    public String getData() {
        return data.get();
    }

    public void setData(String data) {
        this.data.set(data);
    }
}
