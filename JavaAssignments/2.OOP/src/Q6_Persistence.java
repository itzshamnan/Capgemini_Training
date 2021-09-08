abstract class persistance {
    abstract void persist();
}
class FilePersistence extends persistance{
    @Override
    void persist() {

    }
}
class DatabasePersistence extends persistance{
    @Override
    void persist() {

    }
}

public class Q6_Persistence {
    public static void main(String[] args) {
        persistance obj = new DatabasePersistence();
        persistance obj1=new FilePersistence();
        obj.persist();
        obj1.persist();
    }

}
