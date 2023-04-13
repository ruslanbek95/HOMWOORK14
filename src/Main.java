public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person person = new Person("Ruslan", "Програмист");
        Programmer programmer = new Programmer("ruslanbek", "Coding" , "Peaksoft");
        Dancer dancer =new Dancer("Bektur" , "Danser", "step boy step " );
        Singer singer = new Singer("Basta", "musician", "gazgolder");
        System.out.println(person);
        System.out.println(programmer);
        System.out.println(dancer);
        System.out.println(singer);
    }
}