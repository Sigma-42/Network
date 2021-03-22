package Network;

public interface Visitor {
    public void visitFriend(friend f);
    public void visitRomanticRelationship(romanticRelationship r);
    public void visitFamily(family f);
    public void visitPerson(person p);
    public void visitApp(App a);

}
