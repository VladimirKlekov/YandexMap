package ru.netology.yandexmap.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yandex.mapkit.MapKitFactory
import ru.netology.yandexmap.BuildConfig
import ru.netology.yandexmap.R

class MainActivity : AppCompatActivity() {

    /**
    файл с ключом занесен в гитигнор. Для проверки воспользуйтесь шаблоном:
    private val MAPKIT_API_KEY = "ключ сюда"
     */

    private val MAPKIT_API_KEY = BuildConfig.MAPS_API_KEY
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MapKitFactory.setApiKey(MAPKIT_API_KEY)
        setContentView(R.layout.activity_main)

    }
}