package kz.sdu190103159.notesappcss_216

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kz.sdu190103159.notesappcss_216.model.Note
import kz.sdu190103159.notesappcss_216.utils.TYPE_FIREBASE
import kz.sdu190103159.notesappcss_216.utils.TYPE_ROOM

class MainViewMdl(application: Application) : AndroidViewModel(application) {

    val readTest: MutableLiveData<List<Note>> by lazy {
        MutableLiveData<List<Note>>()
    }
    val dataBaseType: MutableLiveData<String> by lazy {
        MutableLiveData<String>(TYPE_ROOM)
    }

    init{
        readTest.value =
            when(dataBaseType.value) {
                TYPE_ROOM ->  {
                    listOf<Note>(
                        Note(title = "Note 1" , subtitle = "Subtitle for note 1"),
                        Note(title = "Note 12" , subtitle = "Subtitle for note 12"),
                        Note(title = "Note 13" , subtitle = "Subtitle for note 13")
                    )
                }
                TYPE_FIREBASE -> listOf()
                else -> listOf()
            }
    }

    fun initDatabase(type : String) {
        dataBaseType.value = type
        Log.d("checkData", "MainViewMd initDatabase with type: $type")
    }
}

class MainViewMdlFactory(private val application: Application) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainViewMdl::class.java)) {
            return MainViewMdl(application = application)  as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }
}