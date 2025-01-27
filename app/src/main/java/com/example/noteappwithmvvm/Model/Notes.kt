

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class Notes(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,        // Unique identifier, auto-incremented.
    val title: String,      // Title of the note.
    val subtitle: String,   // Subtitle of the note.
    val content: String,    // Content of the note.
    val date: String        // Date the note was created or last modified.
) : Parcelable {

    override fun describeContents(): Int {
        // Return 0 since there is no special file descriptor for the object
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        // Writing the properties of the class to the Parcel
        dest.writeInt(id)
        dest.writeString(title)
        dest.writeString(subtitle)
        dest.writeString(content)
        dest.writeString(date)
    }

    // Companion object to recreate the object from a Parcel
    companion object CREATOR : Parcelable.Creator<Notes> {
        override fun createFromParcel(parcel: Parcel): Notes  {
            return Notes (
                id = parcel.readInt(),
                title = parcel.readString() ?: "",
                subtitle = parcel.readString() ?: "",
                content = parcel.readString() ?: "",
                date = parcel.readString() ?: ""
            )
        }

        override fun newArray(size: Int): Array<Notes?> {
            return arrayOfNulls(size)
        }
    }
}
