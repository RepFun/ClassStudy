class AppDataBaseMock {
    val list = mutableListOf<Animal>()

    init {
        for (i in 0..3){
            val animal = Animal(id = i, species = "species$i", dietType = "dietType$i")
            val carnivore1 = Carnivore(0, "Sea leopard", "Carnivore", true)
            val carnivore2 = Carnivore(1, "Maned wolf", "Carnivore", false)
            val herbivore1 = Herbivore(2, "Musk deer", "Herbivore", false)
            val herbivore2 = Herbivore(3, "Yak", "Herbivore", true)
            list.add(animal)
        }
    }
}