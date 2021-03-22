package Network;

import java.util.Objects;

public class relationship {
    private person p1;
    private person p2;
    public relationship(person p1, person p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public relationship(){}


    public person getP1() {
        return p1;
    }

    public void setP1(person p1) {
        this.p1 = p1;
    }

    public person getP2() {
        return p2;
    }

    public void setP2(person p2) {
        this.p2 = p2;
    }


    public boolean equals(relationship other) {
        return (this.getP1() == other.getP1() && this.getP2() == other.getP2());
    }

    @Override
    public int hashCode() {
        return Objects.hash(p1, p2);
    }
}
