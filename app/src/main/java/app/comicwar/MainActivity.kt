package app.comicwar

import app.comicwar.utils.INotificationService

import app.comicwar.ui.CollectionFragment

import android.os.Bundle

import android.app.NotificationChannel
import android.app.NotificationManager

import androidx.activity.addCallback

import androidx.core.app.NotificationCompat

import androidx.fragment.app.commit

import androidx.appcompat.app.AppCompatActivity

private const val NOTIFICATION_ID = "_id"
private const val NOTIFICATION_NAME = "_name"

private const val NOTIFICATION_UUID = 0x010

class MainActivity : AppCompatActivity(), INotificationService {
    private lateinit var notificationManager: NotificationManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        onBackPressedDispatcher.addCallback(this) {}

        notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.createNotificationChannel(NotificationChannel(NOTIFICATION_ID, NOTIFICATION_NAME, NotificationManager.IMPORTANCE_DEFAULT))
    }

    override fun onStart() {
        super.onStart()



        supportFragmentManager.commit {
            replace(R.id.fragment_container, CollectionFragment())
        }
    }

    override fun onNotify(title: String, content: String, smallIcon: Int) {
        notificationManager.notify(NOTIFICATION_UUID, NotificationCompat.Builder(this, NOTIFICATION_ID)
            .setContentTitle(title)
            .setContentText(content)
            .setSmallIcon(smallIcon)
            .build()
        )
    }

    override fun onNotify(title: String, content: String, smallIcon: Int, largeIcon: Int) {
        notificationManager.notify(NOTIFICATION_UUID, NotificationCompat.Builder(this, NOTIFICATION_ID)
            .setContentTitle(title)
            .setContentText(content)
            .setSmallIcon(smallIcon)
            .setLargeIcon(android.graphics.BitmapFactory.decodeResource(resources, largeIcon))
            .build()
        )
    }
}