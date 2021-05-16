import system.MergerEnvironment

class MergerImpl<T : Comparable<T>>(
    private val mergerEnvironment: MergerEnvironment<T>,
    prevStepBatches: Map<Int, List<T>>?
) : Merger<T> {
    override fun mergeStep(): T? {
        TODO("Not yet implemented")
    }

    override fun getRemainingBatches(): Map<Int, List<T>> {
        TODO("Not yet implemented")
    }
}