package Network;

public class family extends relationship {
    public family(person p1, person p2) {
        super(p1, p2);
    }
    public family(){}

    public void accept(Visitor v) {
        v.visitFamily(this);
    }
}
