public class Programmer extends Person{
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void rearn() {
        super.rearn();
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "companyName='" +getCompanyName()+ '\'' +
                '}';
    }
}
