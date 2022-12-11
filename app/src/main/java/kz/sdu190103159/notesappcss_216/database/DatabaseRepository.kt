package kz.sdu190103159.notesappcss_216.database

import android.provider.ContactsContract
import android.provider.ContactsContract.CommonDataKinds.Note
import androidx.lifecycle.LiveData

interface DatabaseRepository {
    val readAll: LiveData<List<ContactsContract.CommonDataKinds.Note>>

    suspend fun create(note: Note, onSucces: ()-> Unit)

    suspend fun update(note: Note, onSucces: ()-> Unit)

    suspend fun delete(note: Note, onSucces: ()-> Unit)

}