package MVCPattern;

public class StudentView {

    void show(StudentModel model) {
        System.out.println(model.getName() + "  " + model.getNumber() + " " + model.getSexual());
    }
}
