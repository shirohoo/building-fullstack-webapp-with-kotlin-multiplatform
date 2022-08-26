package todoapp.domain

import java.util.*

actual interface TodoIdGenerator {
    actual fun generateId(): TodoId = TodoId(UUID.randomUUID().toString())
}