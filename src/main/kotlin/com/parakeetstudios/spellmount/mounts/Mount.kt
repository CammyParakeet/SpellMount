package com.parakeetstudios.spellmount.mounts

import org.bukkit.Location
import org.bukkit.inventory.ItemStack
import java.util.UUID

interface Mount {

    val uniqueId: UUID
    val currentLocation: Location
    val isSpawned: Boolean
    val id: String

    val item: ItemStack
    val

}