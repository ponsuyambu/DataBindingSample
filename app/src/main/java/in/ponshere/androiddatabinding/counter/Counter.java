package in.ponshere.androiddatabinding.counter;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import in.ponshere.androiddatabinding.BR;

/**
 * @author Ponsuyambu
 * @since 7/5/17.
 */

public class Counter extends BaseObservable {
    private int value;
    int initialValue;

    Counter(int initialValue){
        this.initialValue = initialValue;
        setValue(initialValue);
    }

    @Bindable
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyPropertyChanged(BR.value);
    }
}
