package rl.qdevopt

import android.content.Intent
import android.provider.Settings
import android.service.quicksettings.TileService

class DevOptTile : TileService() {
    override fun onClick() {
        super.onClick()

        Intent(Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(this)
        }
    }
}