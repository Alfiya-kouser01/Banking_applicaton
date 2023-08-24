package AGGREGATION;

//import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;

public class Aggregation {
    int id;
    String name;
    Address address;

    public Aggregation(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address=address;
    }
    void display(){
        System.out.println("ID"+id+"Name"+name);
        System.out.println(address.city+address.state+address.country);

    }
    public static void main(String[] args) {

    }
}

