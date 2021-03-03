import java.util.Objects;

public class User {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final User another = (User) obj;
        if (!Objects.equals(this.name, another.name)) {
            return false;
        }

        if (this.age != another.age) {
            return false;
        }

        return true;
    }

}