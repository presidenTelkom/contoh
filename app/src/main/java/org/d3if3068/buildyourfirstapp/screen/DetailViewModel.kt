package org.d3if3068.buildyourfirstapp.screen

import androidx.lifecycle.ViewModel
import org.d3if3068.mobpro1.model.Catatan

class DetailViewModel : ViewModel() {
    fun getCatatan(id: Long): Catatan {
        return Catatan(
            id,
            "Kuliah Mobpro $id Feb",
            "Yey, hari ini belajar membuat aplikasi Android counter dan berhasil. hehe.. Mudah2an modul selanjutnya juga lancar. Aamiin.",
            "2024-02-$id 12:34:56"
        )
    }
}