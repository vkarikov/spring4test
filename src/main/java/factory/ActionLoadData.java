package factory;

public class ActionLoadData implements Action {
    public ActionLoadData() {
        System.out.println("Construct ActionLoadData");
    }

    @Override
    public void doAction() {
        System.out.println("do ActionLoadData");
    }
}
