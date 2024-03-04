package com.parakeetstudios.spellmount

import com.parakeetstudios.spellmount.inject.KoinModule
import com.parakeetstudios.spellmount.managers.Manager
import org.bukkit.plugin.java.JavaPlugin
import org.koin.core.context.startKoin
import org.koin.mp.KoinPlatform.getKoin

class MountPlugin : JavaPlugin() {

    override fun onEnable() {

        val mainModule = KoinModule()
        startKoin {
            modules(
                mainModule.initPlugin(this@MountPlugin),
                mainModule.managerModule
            )
        }

        val managers: List<Manager> = getKoin().getAll()
        managers.forEach { it.onEnable() }

        registerCommands()
    }

    override fun onDisable() {

    }


    private fun registerCommands() {

    }

}