public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public void rearn(){
        System.out.println( name + " is learning");
    }
    public void walk(){
        System.out.println( designation + " is walking");
    }
    public void eat (){
        System.out.println();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", designation='" + getDesignation() + '\'' +
                '}';
    }
}
