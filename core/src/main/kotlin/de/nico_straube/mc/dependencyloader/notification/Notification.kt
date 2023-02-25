package de.nico_straube.mc.dependencyloader.notification

import org.bukkit.command.ConsoleCommandSender
import org.bukkit.entity.Player

data class Notification(val message: Message) {

    fun send(player: Player) {
        player.sendMessage(message.component())
    }

    fun send(consoleCommandSender: ConsoleCommandSender) {
        consoleCommandSender.sendMessage(message.component())
    }
}
