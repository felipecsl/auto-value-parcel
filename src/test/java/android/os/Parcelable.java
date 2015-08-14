package android.os;

/**
 * Created by rharter on 8/12/15.
 */
public interface Parcelable {

  int describeContents();
  void writeToParcel(Object dest, int flags);

}
