public class App {

    public static void main(String[] args) {
        Homework9.sumArrayWithExceptions(new String[][]{{"467", "7", "13","8"}, {"12", "467", "77", "13"}, {"12", "467", "77", "134"}, {"12", "467", "77", "134"}});
        Homework9.sumArrayWithExceptions(new String[][]{{"467", "7", "13","8"}, {"12", "467", "77", "exception"}, {"12", "467", "77", "134"}, {"12", "467", "77", "134"}});
        Homework9.sumArrayWithExceptions(new String[][]{{"467", "7", "13"}, {"12", "467", "77", "13"}, {"12", "467"}});
    }
}
