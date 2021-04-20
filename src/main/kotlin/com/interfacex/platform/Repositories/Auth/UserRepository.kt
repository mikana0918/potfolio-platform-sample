package com.interfacex.platform.Repositories.Auth

import com.interfacex.platform.Models.Auth.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
    fun findByEmail(email: String): User
}