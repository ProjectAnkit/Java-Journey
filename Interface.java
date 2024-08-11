import java.lang.*;

interface Member{
    void callback();
}

class Customer implements Member{
    String name;

    public Customer(String name){
        this.name = name;
    }

    public void callback(){
        System.out.printf("Yes %s here, I will visit !\n",name);
    }
}

class Store{
    Member[] members = new Member[10];
    int counter = 0;

    void Register(Customer c){
        members[counter++] = c;
    }

    void callForSale(){
        for (Member member : members) {
            if(member != null){
                member.callback();
            }
        }
    }
}

class MyFirst{
    public static void main(String[] args){
        Store s = new Store();

        s.Register(new Customer("Meena"));
        s.Register(new Customer("Nipun"));
        s.Register(new Customer("Pallavi"));
        s.Register(new Customer("Shama"));

        s.callForSale();
    }
}


//OUTPUT

/*Yes Meena here, I will visit !
Yes Nipun here, I will visit !
Yes Pallavi here, I will visit !
Yes Shama here, I will visit !*/
