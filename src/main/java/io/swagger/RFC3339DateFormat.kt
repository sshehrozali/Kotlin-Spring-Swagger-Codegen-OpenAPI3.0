package io.swagger

import java.text.FieldPosition

class RFC3339DateFormat : ISO8601DateFormat() {
    // Same as ISO8601DateFormat but serializing milliseconds.
    @Override
    override fun format(date: Date?, toAppendTo: StringBuffer, fieldPosition: FieldPosition?): StringBuffer {
        val value: String = ISO8601Utils.format(date, true)
        toAppendTo.append(value)
        return toAppendTo
    }

    companion object {
        private const val serialVersionUID = 1L
    }
}