package Network;

public class romanticRelationship extends relationship {
    public romanticRelationship(person p1, person p2){
        super(p1,p2);
    }
    public romanticRelationship(){}
    public void accept(Visitor v){
        v.visitRomanticRelationship(this);
    }
}
