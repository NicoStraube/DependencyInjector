package de.nico_straube.mc.dependencyloader.notification

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.minimessage.MiniMessage

enum class Message(private val s: String) {

    PREFIX_SUCCESS("<gray>[<green>✔<gray>]"),
    PREFIX_INFO("<gray>[<yellow>!<gray>]"),
    PREFIX_WARNING("<gray>[<red>!<gray>]"),
    PREFIX_FAILURE("<gray>[<dark_red>✖<gray>]"),

    PLUGIN_LOADED("$PREFIX_INFO <grey>Loaded libraries and dependencies into classpath."),
    ;

    private val messageBuilder = MiniMessage.miniMessage()

    fun component(): Component {
        return messageBuilder.deserialize(this.s)
    }

}
