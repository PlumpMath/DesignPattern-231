package ObserverPattern;


public class ClangObserver extends BaseObserver{

    public ClangObserver(Subject subject,int weight,boolean block) {
        this.subject=subject;
        this.weight=weight;
        this.block=block;
        subject.attach(this);
    }

    public ClangObserver(Subject subject,int weight) {
        this.subject=subject;
        this.weight=weight;
        this.block=false;
        subject.attach(this);
    }

    @Override
    protected void update(int status) {
        System.out.println(this.weight+"   "+status);
    }
}
