package MVCPattern;

public class Controller {

    private StudentModel model;
    private StudentView view;

    public Controller(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setModelNumber(int number) {
        model.setNumber(number);
        updateView();
    }

    public void updateView() {
        view.show(model);
    }

}
