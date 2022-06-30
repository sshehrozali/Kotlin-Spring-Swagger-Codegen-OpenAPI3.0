package io.swagger.model

import java.util.Objects

/**
 * User
 */
@Validated
@Generated(value = ["io.swagger.codegen.languages.SpringCodegen"], date = "2022-06-30T07:35:56.931Z")
class User {
    /**
     * Get id
     * @return id
     */
    @get:ApiModelProperty(value = "")
    @JsonProperty("id")
    var id: Long? = null

    /**
     * Get username
     * @return username
     */
    @get:ApiModelProperty(value = "")
    @JsonProperty("username")
    var username: String? = null

    /**
     * Get firstName
     * @return firstName
     */
    @get:ApiModelProperty(value = "")
    @JsonProperty("firstName")
    var firstName: String? = null

    /**
     * Get lastName
     * @return lastName
     */
    @get:ApiModelProperty(value = "")
    @JsonProperty("lastName")
    var lastName: String? = null

    /**
     * Get email
     * @return email
     */
    @get:ApiModelProperty(value = "")
    @JsonProperty("email")
    var email: String? = null

    /**
     * Get password
     * @return password
     */
    @get:ApiModelProperty(value = "")
    @JsonProperty("password")
    var password: String? = null

    /**
     * Get phone
     * @return phone
     */
    @get:ApiModelProperty(value = "")
    @JsonProperty("phone")
    var phone: String? = null

    @JsonProperty("userStatus")
    private var userStatus: Integer? = null
    fun id(id: Long?): User {
        this.id = id
        return this
    }

    fun username(username: String?): User {
        this.username = username
        return this
    }

    fun firstName(firstName: String?): User {
        this.firstName = firstName
        return this
    }

    fun lastName(lastName: String?): User {
        this.lastName = lastName
        return this
    }

    fun email(email: String?): User {
        this.email = email
        return this
    }

    fun password(password: String?): User {
        this.password = password
        return this
    }

    fun phone(phone: String?): User {
        this.phone = phone
        return this
    }

    fun userStatus(userStatus: Integer?): User {
        this.userStatus = userStatus
        return this
    }

    /**
     * User Status
     * @return userStatus
     */
    @ApiModelProperty(value = "User Status")
    fun getUserStatus(): Integer? {
        return userStatus
    }

    fun setUserStatus(userStatus: Integer?) {
        this.userStatus = userStatus
    }

    @Override
    override fun equals(o: Any?): Boolean {
        if (this === o) {
            return true
        }
        if (o == null || getClass() !== o.getClass()) {
            return false
        }
        val user = o as User
        return Objects.equals(id, user.id) &&
                Objects.equals(username, user.username) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(email, user.email) &&
                Objects.equals(password, user.password) &&
                Objects.equals(phone, user.phone) &&
                Objects.equals(userStatus, user.userStatus)
    }

    @Override
    override fun hashCode(): Int {
        return Objects.hash(id, username, firstName, lastName, email, password, phone, userStatus)
    }

    @Override
    override fun toString(): String {
        val sb: StringBuilder = StringBuilder()
        sb.append("class User {\n")
        sb.append("    id: ").append(toIndentedString(id)).append("\n")
        sb.append("    username: ").append(toIndentedString(username)).append("\n")
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n")
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n")
        sb.append("    email: ").append(toIndentedString(email)).append("\n")
        sb.append("    password: ").append(toIndentedString(password)).append("\n")
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n")
        sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n")
        sb.append("}")
        return sb.toString()
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private fun toIndentedString(o: Any?): String {
        return o?.toString()?.replace("\n", "\n    ") ?: "null"
    }
}