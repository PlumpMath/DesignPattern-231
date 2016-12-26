package MVCPattern;

public class StudentModel {

    private String name;
    private int number;
    private Sexual sexual;

    public StudentModel(String name, int number, Sexual sexual) {
        this.name = name;
        this.number = number;
        this.sexual = sexual;
    }


    String getName() {
        return name;
    }

    int getNumber() {
        return number;
    }

    void setNumber(int number) {
        this.number = number;
    }

    Sexual getSexual() {
        return sexual;
    }

    public enum Sexual {
        BOY,
        GIRL
    }
}
