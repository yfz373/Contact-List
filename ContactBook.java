public class ContactBook {
    private Contact head;

    public void addContact(String name, String phone, String email){
        Contact newContact = new Contact(name, phone, email);
        if (head==null){
            head=newContact;
        }else{
            Contact temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next=newContact;
        }
        System.out.println("Contact added successfully!");
    }

    public void deleteContact(String name){
        if (head==null){
            System.out.println("Contact list is empty.");
            return;
        }
        if (head.name.equalsIgnoreCase(name)){
            head=head.next;
            System.out.println("Contact deleted successfully!");
            return;
        }

        Contact temp = head;
        while (temp.next != null && !temp.next.name.equalsIgnoreCase(name)){
            temp = temp.next;
        }
        if (temp.next ==null){
            System.out.println("Contact not found.");
        }else{
            temp.next = temp.next.next;
            System.out.println("Contact deleted successfully!");
        }
    }

    public void searchContact(String name){
        Contact temp = head;
        while (temp != null){
            if (temp.name.equalsIgnoreCase(name)){
                System.out.println("Found: "+temp.name+" | " + temp.phone + " | " + temp.email);
                return;
            }
            temp=temp.next;
        }
        System.out.println("Contact not found.");
    }

    public void searchByEmail(String email){
        Contact temp = head;
        while (temp != null){
            if (temp.email.equalsIgnoreCase(email)){
                System.out.println("Found: " + temp.name + " | " + temp.phone + " | " + temp.email);
                return;
            }
            temp=temp.next;
        }
        System.out.println("Email not found");
    }

    public void printContacts(){
        if (head==null){
            System.out.println("No contacts available.");
            return;
        }
        Contact temp = head;
        while (temp!=null){
            System.out.println(temp.name + " | " + temp.phone + " | " + temp.email);
            temp=temp.next;
        }
    }
}
