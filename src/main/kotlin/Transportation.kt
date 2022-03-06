class Transportation<T:Transport>(val data:T?) {
    override fun toString(): String {
        return "$data"
    }
}