package org.d3if3068.buildyourfirstapp.navigation

import org.d3if3068.buildyourfirstapp.screen.KEY_ID_CATATAN

sealed class Screen(val route: String) { //sealed memanggil tipe data diri nya sendiri
    data object Home : Screen("mainScreen")
    data object FormBaru : Screen("detailScreen")
    data object FormUbah : Screen("detailScreen/{$KEY_ID_CATATAN}") {
        fun withId(id: Long) = "detailScreen/$id"
    }
}