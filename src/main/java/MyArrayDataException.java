public class MyArrayDataException extends Exception{
    private int i;
    private int j;

    public MyArrayDataException(int i, int j) {
        this.i = i + 1; //для удобства восприятия прибавляем к индексам по единице
        this.j = j + 1;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
