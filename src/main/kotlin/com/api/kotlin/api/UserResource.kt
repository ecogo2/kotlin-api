package com.api.kotlin.api

import com.api.kotlin.model.User
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import com.api.kotlin.repository.UserRepository
import org.springframework.data.repository.findByIdOrNull
import java.util.UUID;

@RestController
@RequestMapping("/users") @EnableWebMvc
class UserResource(val userRepository: UserRepository) {

    @PostMapping
    fun saveUser(@RequestBody user: User) = userRepository.saveAndFlush(user);

    @GetMapping
    fun getAllUsers(): List<User> = userRepository.findAll();

    @GetMapping("/{id}")
    fun getById(@PathVariable id: UUID): User? = userRepository.findByIdOrNull(id);
}