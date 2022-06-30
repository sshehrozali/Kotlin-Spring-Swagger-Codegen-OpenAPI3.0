package io.swagger.model

import java.util.Objects
import javax.validation.constraints.NotNull

/**
 * Pet
 */
@Validated
@Generated(value = ["io.swagger.codegen.languages.SpringCodegen"], date = "2022-06-30T07:35:56.931Z")
class Pet {
    /**
     * Get id
     * @return id
     */
    @get:ApiModelProperty(value = "")
    @JsonProperty("id")
    var id: Long? = null

    /**
     * Get category
     * @return category
     */
    @get:Valid
    @get:ApiModelProperty(value = "")
    @JsonProperty("category")
    var category: Category? = null

    /**
     * Get name
     * @return name
     */
    @get:NotNull
    @get:ApiModelProperty(example = "doggie", required = true, value = "")
    @JsonProperty("name")
    var name: String? = null

    /**
     * Get photoUrls
     * @return photoUrls
     */
    @get:NotNull
    @get:ApiModelProperty(required = true, value = "")
    @JsonProperty("photoUrls")
    @Valid
    var photoUrls: List<String> = ArrayList<String>()

    /**
     * Get tags
     * @return tags
     */
    @get:Valid
    @get:ApiModelProperty(value = "")
    @JsonProperty("tags")
    @Valid
    var tags: List<Tag>? = null

    /**
     * pet status in the store
     */
    enum class StatusEnum(private val value: String) {
        AVAILABLE("available"), PENDING("pending"), SOLD("sold");

        @Override
        @JsonValue
        override fun toString(): String {
            return String.valueOf(value)
        }

        companion object {
            @JsonCreator
            fun fromValue(text: String?): StatusEnum? {
                for (b in values()) {
                    if (String.valueOf(b.value).equals(text)) {
                        return b
                    }
                }
                return null
            }
        }
    }

    /**
     * pet status in the store
     * @return status
     */
    @get:ApiModelProperty(value = "pet status in the store")
    @JsonProperty("status")
    var status: StatusEnum? = null
    fun id(id: Long?): Pet {
        this.id = id
        return this
    }

    fun category(category: Category?): Pet {
        this.category = category
        return this
    }

    fun name(name: String?): Pet {
        this.name = name
        return this
    }

    fun photoUrls(photoUrls: List<String>): Pet {
        this.photoUrls = photoUrls
        return this
    }

    fun addPhotoUrlsItem(photoUrlsItem: String?): Pet {
        photoUrls.add(photoUrlsItem)
        return this
    }

    fun tags(tags: List<Tag>?): Pet {
        this.tags = tags
        return this
    }

    fun addTagsItem(tagsItem: Tag?): Pet {
        if (tags == null) {
            tags = ArrayList<Tag>()
        }
        tags.add(tagsItem)
        return this
    }

    fun status(status: StatusEnum?): Pet {
        this.status = status
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
        val pet = o as Pet
        return Objects.equals(id, pet.id) &&
                Objects.equals(this.category, pet.category) &&
                Objects.equals(name, pet.name) &&
                Objects.equals(photoUrls, pet.photoUrls) &&
                Objects.equals(tags, pet.tags) &&
                Objects.equals(status, pet.status)
    }

    @Override
    override fun hashCode(): Int {
        return Objects.hash(id, category, name, photoUrls, tags, status)
    }

    @Override
    override fun toString(): String {
        val sb: StringBuilder = StringBuilder()
        sb.append("class Pet {\n")
        sb.append("    id: ").append(toIndentedString(id)).append("\n")
        sb.append("    category: ").append(toIndentedString(category)).append("\n")
        sb.append("    name: ").append(toIndentedString(name)).append("\n")
        sb.append("    photoUrls: ").append(toIndentedString(photoUrls)).append("\n")
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n")
        sb.append("    status: ").append(toIndentedString(status)).append("\n")
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