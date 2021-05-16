import system.DataHolderEnvironment

class DataHolderImpl<T : Comparable<T>>(
    private val keys: List<T>,
    private val dataHolderEnvironment: DataHolderEnvironment
) : DataHolder<T> {
    override fun checkpoint() {
        TODO("Not yet implemented")
    }

    override fun rollBack() {
        TODO("Not yet implemented")
    }

    override fun getBatch(): List<T> {
        TODO("Not yet implemented")
    }
}