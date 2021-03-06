package nfiniteloop.net.loqale;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by vaek on 12/1/14.
 */
public class MessageItem implements Parcelable {
    private Drawable picture;
    private String username;
    private String message;

    public MessageItem() {}

    public MessageItem(String username, String message, Drawable picture) {
        this.picture = picture;
        this.username = username;
        this.message = message;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(username);
        parcel.writeString(message);

    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public Drawable getPicture() {
        return picture;
    }

    public void setPicture(Drawable picture) {
        this.picture = picture;
    }
}


