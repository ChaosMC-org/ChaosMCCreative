package xyz.lncvrt.chaosmccreative.events

import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.vehicle.VehicleCreateEvent

class VehicleCreateListener : Listener {
    @EventHandler
    fun onVehicleCreateEvent(event: VehicleCreateEvent) {
        val chunk = event.vehicle.location.chunk
        val entities = chunk.entities.filter { it !is Player }
        if (entities.size > 9) entities.forEach { it.remove() }
    }
}