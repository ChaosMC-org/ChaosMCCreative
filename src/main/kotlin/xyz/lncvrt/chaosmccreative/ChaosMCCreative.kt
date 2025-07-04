package xyz.lncvrt.chaosmccreative

import net.kyori.adventure.text.minimessage.MiniMessage
import org.bukkit.plugin.java.JavaPlugin
import xyz.lncvrt.chaosmccreative.events.*

class ChaosMCCreative : JavaPlugin() {
    internal val miniMessage = MiniMessage.miniMessage()

    override fun onEnable() {
        server.pluginManager.registerEvents(EntityMoveListener(), this)
        server.pluginManager.registerEvents(PlayerInteractListener(), this)
        server.pluginManager.registerEvents(PlayerJoinListener(this), this)
        server.pluginManager.registerEvents(ProjectileLaunchListener(), this)
        server.pluginManager.registerEvents(VehicleCreateListener(), this)
        server.pluginManager.registerEvents(VehicleMoveListener(), this)
    }
}
