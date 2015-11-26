package bmoore.encryptext.model;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;


public class KeyRequest implements Parcelable {

    public static final Creator<KeyRequest> CREATOR = new Creator<KeyRequest>()
    {
        public KeyRequest createFromParcel(Parcel paramAnonymousParcel)
        {
            return new KeyRequest(paramAnonymousParcel);
        }

        public KeyRequest[] newArray(int paramAnonymousInt)
        {
            return new KeyRequest[paramAnonymousInt];
        }
    };

    private String name;
    private String status;
    private String date;
    private Bitmap contactThumb;

    public KeyRequest()
    {
        this.name = "";
        this.status = "";
        this.contactThumb = null;
    }

    public KeyRequest(String name, String status, String date, Bitmap contactThumb)
    {
        this.name = name;
        this.status = status;
        this.date = date;
        this.contactThumb = contactThumb;
    }

    public KeyRequest(Parcel p)
    {
        this.name = p.readString();
        this.status = p.readString();
        this.date = p.readString();
        this.contactThumb = p.readParcelable(Bitmap.class.getClassLoader());
    }

    public Bitmap getContactThumb() {
        return contactThumb;
    }

    public void setContactThumb(Bitmap contactThumb) {
        this.contactThumb = contactThumb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public void writeToParcel(Parcel p, int paramInt)
    {
        p.writeString(name);
        p.writeString(status);
        p.writeString(date);
        p.writeParcelable(contactThumb, 0);
    }

    @Override
    public int describeContents() { return  0; }
}
