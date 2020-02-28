package com.api.kotlin.model

import javax.persistence.Entity
import java.util.UUID;
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "app_user")
data class User(
        @Id
        val id: UUID? = UUID.randomUUID(),
        val firstName: String,
        val lastName: String,
        val phoneNumber: String
)