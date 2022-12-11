package kz.sdu190103159.notesappcss_216.model

import androidx.room.Entity


@Entity(tableName = "notes_table")
data class Note (
    @PrimatyKey(autoGenerate = true)
    val id: Int,
            val title: String,
                    val subtitle: String
)