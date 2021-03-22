package Network;

public class friend extends relationship {
    public friend(person p1, person p2){
        super(p1,p2);
    }
    public friend(){}

    public void accept(Visitor v){
        v.visitFriend(this);
    }
}
