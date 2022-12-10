fun main(args: Array<String>) {

    val appDataBaseMock = AppDataBaseMock()

    val repository = AnimalsRepository(appDataBaseMock)

    println(repository.getAll())

    val carnivore1 = Carnivore(0, "Sea leopard", "Carnivore", true)
    val carnivore2 = Carnivore(1, "Maned wolf", "Carnivore", false)
    val herbivore1 = Herbivore(2, "Musk deer", "Herbivore", false)
    val herbivore2 = Herbivore(3, "Yak", "Herbivore", true)
    println("Species name:${carnivore1.species}, Diet type:${carnivore1.dietType}, Is marine:${carnivore1.isMarine}")
    println("Species name:${carnivore2.species}, Diet type:${carnivore2.dietType}, Is marine:${carnivore2.isMarine}")
    println("Species name:${herbivore1.species}, Diet type:${herbivore1.dietType}, Have horns:${herbivore1.withHorns}")
    println("Species name:${herbivore2.species}, Diet type:${herbivore2.dietType}, Have horns:${herbivore2.withHorns}")

    val list = mutableListOf<Animal>()
    list.add(carnivore1)
    list.add(carnivore2)
    list.add(herbivore1)
    list.add(herbivore2)}
