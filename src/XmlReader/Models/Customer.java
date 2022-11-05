package XmlReader.Models;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private Long id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private List<Address> addresses = new ArrayList<>();

    public Long getId(){
        return id;
    }
}
