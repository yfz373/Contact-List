public class Contact {
    String name, phone, email;
    Contact next;

    public Contact(String name, String phone, String email){
        this.name=name;
        this.phone=phone;
        this.email=email;
        this.next=null;
    }

}
