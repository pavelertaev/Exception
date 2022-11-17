import java.util.Objects;

public class PhoneBook {
    private String name;
    private String soname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSoname() {
        return soname;
    }

    public void setSoname(String soname) {
        this.soname = soname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneBook phoneBook = (PhoneBook) o;
        return Objects.equals(name, phoneBook.name) && Objects.equals(soname, phoneBook.soname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, soname);
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "name='" + name + '\'' +
                ", soname='" + soname + '\'' +
                '}';
    }

    public PhoneBook(String name, String soname) {
        this.name = name;
        this.soname = soname;

    }
}
