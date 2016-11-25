package ObserverPattern;


abstract class BaseObserver{
    boolean block;
    int weight;
    Subject subject;
    abstract void update(int status);
}
