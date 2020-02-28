package com.api.kotlin.repository

import com.api.kotlin.model.User
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID;

interface UserRepository: JpaRepository<User, UUID>