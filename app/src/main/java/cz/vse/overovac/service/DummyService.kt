package cz.vse.overovac.service

import android.content.Context
import android.widget.Toast

class DummyService(val context: Context) {

    fun showToast() = Toast.makeText(context, "Hello i try show toast", Toast.LENGTH_SHORT).show()
}
