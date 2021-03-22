package Network;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class printVisitor implements Visitor{
    @Override
    public void visitFriend(friend f) {
        System.out.println(f.getP1()+" is friends with "+f.getP2());
    }

    @Override
    public void visitRomanticRelationship(romanticRelationship r) {
        System.out.println(r.getP1()+" is in a romantic relationship with "+r.getP2());
    }

    @Override
    public void visitFamily(family f) {
        System.out.println(f.getP1()+" is family with "+f.getP2());
    }

    @Override
    public void visitPerson(person p) {
    }
    @Override
    public void visitApp(App a){
        System.out.println("Relationships: ");
        System.out.println("Familial relationships: "+a.getFamilies().size());
        System.out.println("Friendships: "+a.getFriends().size());
        System.out.println("Romantic relationships: "+a.getRomantics().size());

    }
}
