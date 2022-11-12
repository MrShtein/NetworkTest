package ru.mrshtein.work_with_network

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin
import ru.mrshtein.network.networkModule

class NetworkApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@NetworkApplication)
            modules(
                listOf(
                    networkModule,
                )
            )
        }
    }
}