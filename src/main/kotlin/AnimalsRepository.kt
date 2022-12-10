class AnimalsRepository constructor(private val appDataBaseMock: AppDataBaseMock) {

    fun getAll(): MutableList<Animal> {
        return appDataBaseMock.list
    }

    fun findById(id: Int): Animal? {
        return appDataBaseMock.list.find { it.id == id}
    }

    fun insert(animal: Animal): Unit{
        appDataBaseMock.list.add(animal)
    }

    fun delete(animal: Animal){
        appDataBaseMock.list.remove(animal)
    }

    fun update(animal: Animal){
        val animalsF = findById(animal.id)
        if (animalsF != null){
            val index = appDataBaseMock.list.indexOf(animalsF)
            appDataBaseMock.list[index] = animal
        }

    }
}