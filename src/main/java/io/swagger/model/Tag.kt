package io.swagger.model

import java.util.Objects

/**
 * Tag
 */
@Validated
@Generated(value = ["io.swagger.codegen.languages.SpringCodegen"], date = "2022-06-30T07:35:56.931Z")
class Tag {
    /**
     * Get id
     * @return id
     */
    @get:ApiModelProperty(value = "")
    @JsonProperty("id")
    var id: Long? = null

    /**
     * Get name
     * @return name
     */
    @get:ApiModelProperty(value = "")
    @JsonProperty("name")
    var name: String? = null
    fun id(id: Long?): Tag {
        this.id = id
        return this
    }

    fun name(name: String?): Tag {
        this.name = name
        return this
    }

    @Override
    override fun equals(o: Any?): Boolean {
        if (this === o) {
            return true
        }
        if (o == null || getClass() !== o.getClass()) {
            return false
        }
        val tag = o as Tag
        return Objects.equals(id, tag.id) &&
                Objects.equals(name, tag.name)
    }

    @Override
    override fun hashCode(): Int {
        return Objects.hash(id, name)
    }

    @Override
    override fun toString(): String {
        val sb: StringBuilder = StringBuilder()
        sb.append("class Tag {\n")
        sb.append("    id: ").append(toIndentedString(id)).append("\n")
        sb.append("    name: ").append(toIndentedString(name)).append("\n")
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