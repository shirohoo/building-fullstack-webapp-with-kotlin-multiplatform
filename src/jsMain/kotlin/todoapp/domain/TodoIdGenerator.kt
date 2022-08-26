package todoapp.domain

actual interface TodoIdGenerator {
    actual fun generateId(): TodoId = TodoId(external.uuid.v4())
}