package com.parakeetstudios.spellmount.inject

import com.parakeetstudios.spellmount.MountPlugin
import com.parakeetstudios.spellmount.managers.MagicMountManager
import com.parakeetstudios.spellmount.managers.Manager
import org.koin.dsl.bind
import org.koin.dsl.module

class KoinModule {

    fun initPlugin(plugin: MountPlugin) = module {
        single { plugin }
        single { plugin.logger }
    }

    // Module for managing classes
    val managerModule = module {
        single { MagicMountManager() } bind Manager::class
    }


}