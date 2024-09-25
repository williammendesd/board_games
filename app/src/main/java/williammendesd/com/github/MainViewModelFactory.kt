package williammendesd.com.github

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainViewModelFactory (private val repository:
                            BoardGameRepository ) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom( MainViewModel ::class.java)) {
            @Suppress("UNCHECKED_CAST" )
            return MainViewModel( repository) as T
        }
        throw IllegalArgumentException( "Unknown ViewModel class" )
    }
}
