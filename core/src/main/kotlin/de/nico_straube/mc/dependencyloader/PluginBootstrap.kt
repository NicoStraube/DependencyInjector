package de.nico_straube.mc.dependencyloader

import net.kyori.adventure.text.minimessage.MiniMessage
import org.bukkit.plugin.java.JavaPlugin

class PluginBootstrap : JavaPlugin() {

    override fun onEnable() {
        server.consoleSender.sendMessage(MiniMessage.miniMessage().deserialize("<gray>[<yellow>!<gray>] <grey>Loaded libraries and dependencies into classpath."))
    }

}
