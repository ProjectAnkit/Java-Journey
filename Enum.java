import java.lang.*;

enum Dept{
    CSE("Shravan","Block B"), ME("Tanya","Block A"), ECE("Kavya","Block D"), IT("Surbhi","Block C");
    final String Head;
    final String leadBlock;

     Dept(String head,String LeadBlock){
         this.Head = head;
         this.leadBlock = LeadBlock;
        System.out.println(this.name()+" "+this.ordinal());
    }
}

class Test{
    public static void main(String[] args){
        Dept dt = Dept.IT;
        System.out.println("Main method :"+dt.Head+" "+dt.leadBlock);
    }
}
