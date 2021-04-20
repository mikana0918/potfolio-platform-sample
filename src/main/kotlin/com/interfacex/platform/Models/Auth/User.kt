package com.interfacex.platform.Models.Auth

import org.springframework.data.annotation.Id
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Table

/**
 * userテーブルのEntity.
 * @param id 主キー
 * @param name 名前
 * @param age 年齢
 * @param sex 性別 ( 0・・・ 女  1・・・男)
 */
@Entity
@Table(name = "users")
data class User (
    @javax.persistence.Id @Id @GeneratedValue var id: Long? = 0,
    @Column(nullable = false) var name: String = "",
    @Column(nullable = false) var email: String = "",
    @Column(nullable = false) var encrypted_password: String = "",
    @Column var age: Int? = 0,
    @Column(nullable = false) var sex: Int = 0
)
