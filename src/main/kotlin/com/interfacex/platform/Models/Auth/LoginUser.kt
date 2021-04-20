package com.interfacex.platform.Models.Auth

import org.springframework.security.core.authority.AuthorityUtils

class LoginUser (user: User): org.springframework.security.core.userdetails.User (
    user.email,
    user.encrypted_password,
    AuthorityUtils.createAuthorityList("ROLE_USER")
) {
    /**
     * ログインユーザー
     */
    var loginUser: User? = null

    init{
        // スーパークラスのユーザーID、パスワードに値をセットする
        // 実際の認証はスーパークラスのユーザーID、パスワードで行われる
        this.loginUser = user
    }
}