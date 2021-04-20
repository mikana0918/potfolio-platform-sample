package com.interfacex.platform.Services

import com.interfacex.platform.Models.Auth.User
import com.interfacex.platform.Repositories.Auth.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * DBからのデータ取得と加工を行う.
 */
@Service
open class UserService @Autowired constructor(private val userRepository: UserRepository){
    /**
     * 全ユーザリストの取得
     * @return ユーザリスト
     */
    fun findAllUser(): MutableList<User> = userRepository.findAll()
    fun findByEmail(email:String): User = userRepository.findByEmail(email)
}