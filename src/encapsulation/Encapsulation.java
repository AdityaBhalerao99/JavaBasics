package encapsulation;

class College {

    public String getAddr() {
        return addr;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    private int id = 123;
    private String name = "Dr D Y PAtil";
    private String addr = "Lohegoan";
}

public class Encapsulation {
    public static void main(String[] args) {

        College c = new College();
        System.out.println(c.getId() + c.getName() + c.getAddr());

    }
}
