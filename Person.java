import java.io.Serializable;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    transient int id;
    private String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
