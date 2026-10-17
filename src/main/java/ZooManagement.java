public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal("Felides", "Simba", 5, true);
        Animal elephant = new Animal("Elephantides", "Dumbo", 10, true);
        Animal perroquet = new Animal("Psittacides", "Coco", 2, false);
        Zoo myZoo = new Zoo("Belvedere", "Tunis", 20);

        myZoo.animals[0] = lion;
        myZoo.animals[1] = elephant;
        myZoo.animals[2] = perroquet;

        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        System.out.println(lion);
        System.out.println(elephant);
        System.out.println(perroquet);
    }
}
