package in.ponshere.androiddatabinding.observable;

import android.databinding.ObservableField;

/**
 * @author Ponsuyambu
 * @since 7/5/17.
 */

public class User {
    public ObservableField<String> firstName = new ObservableField<>();
    public ObservableField<String> lastName = new ObservableField<>();
    public User(String firstName, String lastName) {
        this.firstName.set(firstName);
        this.lastName.set(lastName);
    }
}
