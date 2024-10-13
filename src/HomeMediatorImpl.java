import java.util.ArrayList;
import java.util.List;

class HomeMediatorImpl implements HomeMediator {
    private List<String> data = new ArrayList<>();

    public void collectData(String data) {
        this.data.add(data);
    }

    public void printReport() {
        System.out.println("Home Report: " + String.join(", ", data));
    }
}
