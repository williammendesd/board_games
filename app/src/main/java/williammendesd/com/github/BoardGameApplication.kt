package williammendesd.com.github

import android.app.Application

class BoardGameApplication : Application() {
    val database by lazy { BoardGameDatabase .getDatabase( this) }
    val repository by lazy {
        BoardGameRepository( database.boardGameDao()) }
}