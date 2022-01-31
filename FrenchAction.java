public class FrenchAction extends Action{

    private String action;

    FrenchAction(String a){
        super();
        action = a;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return null;
    }

    @Override
    public int compareTo(Action a) {
        return action.compareTo(((FrenchAction)a).toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof FrenchAction)) return false;

        return compareTo( (FrenchAction) o ) == 0;
    }

    @Override
    public int hashCode() {
        return action.hashCode();
    }

    @Override
    public String toString() {
        return action;
    }

}
