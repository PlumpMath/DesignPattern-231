package ObserverPattern;


import java.util.Comparator;
import java.util.TreeSet;

public class Subject {

    private TreeSet<BaseObserver> observers=new TreeSet<>(new Comparator<BaseObserver>() {
        @Override
        public int compare(BaseObserver o1,BaseObserver o2){
            if (o1.weight > o2.weight)
                return 1;
            if (o1.weight < o2.weight)
                return -1;
            else
                return 0;
        }
    });

    private int status;

    public void setStatus(int status) {
        this.status = status;
        notifyObserver();
    }

     void attach(BaseObserver observer){
        observers.add(observer);
    }

    private void notifyObserver(){
        for (BaseObserver observer:observers) {
            observer.update(status);
            if (observer.block)
                return;
        }
    }
}
