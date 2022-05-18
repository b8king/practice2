public class Main extends Application {
    public static void main(String[] args) {
        Application application = new Application();
        application.request("Иван","Иванов","Бумага А4");
        System.out.println(application.arrayList.toString());
    }
}
