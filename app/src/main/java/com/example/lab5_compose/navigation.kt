package com.example.lab5_compose

sealed class navigation(val icon: Int, val title: String, val ruta: String) {
    object screen1 : navigation(com.google.android.material.R.drawable.mtrl_ic_arrow_drop_down, "MainActivity", "screen_1")
    object screen2: navigation(com.google.android.material.R.drawable.mtrl_ic_arrow_drop_up,"Activity2","screen_2")
    object screen3: navigation(com.google.android.material.R.drawable.ic_mtrl_checked_circle, "Activity3", "screen_3")
    object screen4: navigation(R.drawable.star, "Activity4", "screen_4")
}
