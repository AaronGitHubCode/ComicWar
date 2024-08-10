package app.comicwar.utils

interface INotificationService {
    fun onNotify(title: String, content: String, smallIcon: Int, largeIcon: Int)
    fun onNotify(title: String, content: String, smallIcon: Int)
}