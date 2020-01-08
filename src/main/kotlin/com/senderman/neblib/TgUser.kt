package com.senderman.neblib

import org.telegram.telegrambots.meta.api.objects.User

open class TgUser(val id: Int, name: String) {
    val name = if (name.isBlank()) "Без имени" else name
        .replace("<", "&lt;")
        .replace(">", "&gt;")
        .replace("&", "&amp;")

    val link: String
        get() = "<a href=\"tg://user?id=$id\">$name</a>"

    constructor(user: User) : this(user.id, user.firstName)
}
