package ObserverPattern;


abstract class BaseObserver {

    boolean block;
    int weight;
    Subject subject;

    public void setBlock(boolean block) {
        this.block = block;
    }

    abstract void update(int status);
}
