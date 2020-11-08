package org.itmodreamteam.myrest.shared.domain

import java.time.LocalDateTime

data class User(
    val id: Long,
    val created: LocalDateTime,
    val updated: LocalDateTime,
    val enabled: Boolean,
    val locked: Boolean,
    val firstName: String,
    val lastName: String,
    val role: Role?
) {
    enum class Role {
        ADMIN,
    }
}
