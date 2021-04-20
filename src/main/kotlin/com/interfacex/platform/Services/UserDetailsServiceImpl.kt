package com.interfacex.platform.Services

import com.interfacex.platform.Models.Auth.LoginUser
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Component
import com.interfacex.platform.Models.Auth.User

/**
 * UserDetailsServiceの実装クラス
 * Spring Securityでのユーザー認証に使用する
 */
@Component
open class UserDetailsServiceImpl : UserDetailsService {
    @Autowired
    lateinit var userService: UserService

    override fun loadUserByUsername(username: String): UserDetails {
       // 認証を行うユーザー情報を格納する
        var user: User?
        try {
            // 入力したユーザーIDから認証を行うユーザー情報を取得する
            user = userService.findByEmail(username)
        } catch (e: Exception) {
            // 取得時にExceptionが発生した場合
            throw UsernameNotFoundException("failed to fetch user id");
        }

        // ユーザー情報が取得できたらSpring Securityで認証できる形で戻す
        return LoginUser(user);
    }
}