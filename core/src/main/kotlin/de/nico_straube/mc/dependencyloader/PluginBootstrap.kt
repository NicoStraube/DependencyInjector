package de.nico_straube.mc.dependencyloader

import de.nico_straube.mc.dependencyloader.notification.Message
import de.nico_straube.mc.dependencyloader.notification.Notification
import org.bukkit.plugin.java.JavaPlugin

class PluginBootstrap : JavaPlugin() {

    override fun onEnable() {
        Notification(Message.PLUGIN_LOADED).send(server.consoleSender)
    }

}
