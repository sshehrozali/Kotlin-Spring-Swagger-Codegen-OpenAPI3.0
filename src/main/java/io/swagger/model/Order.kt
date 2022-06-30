package io.swagger.model

import java.util.Objects

/**
 * Order
 */
@Validated
@Generated(value = ["io.swagger.codegen.languages.SpringCodegen"], date = "2022-06-30T07:35:56.931Z")
class Order {
    /**
     * Get id
     * @return id
     */
    @get:ApiModelProperty(value = "")
    @JsonProperty("id")
    var id: Long? = null

    /**
     * Get petId
     * @return petId
     */
    @get:ApiModelProperty(value = "")
    @JsonProperty("petId")
    var petId: Long? = null

    @JsonProperty("quantity")
    private var quantity: Integer? = null

    @JsonProperty("shipDate")
    private var shipDate: OffsetDateTime? = null

    /**
     * Order Status
     */
    enum class StatusEnum(private val value: String) {
        PLACED("placed"), APPROVED("approved"), DELIVERED("delivered");

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
     * Order Status
     * @return status
     */
    @get:ApiModelProperty(value = "Order Status")
    @JsonProperty("status")
    var status: StatusEnum? = null

    /**
     * Get complete
     * @return complete
     */
    @get:ApiModelProperty(value = "")
    @JsonProperty("complete")
    var isComplete = false
    fun id(id: Long?): Order {
        this.id = id
        return this
    }

    fun petId(petId: Long?): Order {
        this.petId = petId
        return this
    }

    fun quantity(quantity: Integer?): Order {
        this.quantity = quantity
        return this
    }

    /**
     * Get quantity
     * @return quantity
     */
    @ApiModelProperty(value = "")
    fun getQuantity(): Integer? {
        return quantity
    }

    fun setQuantity(quantity: Integer?) {
        this.quantity = quantity
    }

    fun shipDate(shipDate: OffsetDateTime?): Order {
        this.shipDate = shipDate
        return this
    }

    /**
     * Get shipDate
     * @return shipDate
     */
    @ApiModelProperty(value = "")
    @Valid
    fun getShipDate(): OffsetDateTime? {
        return shipDate
    }

    fun setShipDate(shipDate: OffsetDateTime?) {
        this.shipDate = shipDate
    }

    fun status(status: StatusEnum?): Order {
        this.status = status
        return this
    }

    fun complete(complete: Boolean): Order {
        isComplete = complete
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
        val order = o as Order
        return Objects.equals(id, order.id) &&
                Objects.equals(petId, order.petId) &&
                Objects.equals(quantity, order.quantity) &&
                Objects.equals(shipDate, order.shipDate) &&
                Objects.equals(status, order.status) &&
                Objects.equals(isComplete, order.isComplete)
    }

    @Override
    override fun hashCode(): Int {
        return Objects.hash(id, petId, quantity, shipDate, status, isComplete)
    }

    @Override
    override fun toString(): String {
        val sb: StringBuilder = StringBuilder()
        sb.append("class Order {\n")
        sb.append("    id: ").append(toIndentedString(id)).append("\n")
        sb.append("    petId: ").append(toIndentedString(petId)).append("\n")
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n")
        sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n")
        sb.append("    status: ").append(toIndentedString(status)).append("\n")
        sb.append("    complete: ").append(toIndentedString(isComplete)).append("\n")
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