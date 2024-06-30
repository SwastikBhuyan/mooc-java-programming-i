
public class Statistics {

    private int number;
    private int count;

    public Statistics() {
        this.number = 0;
    }

    public void addNumber(int number) {
        this.number += number;
        count += 1;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return this.number;
    }

    public double average() {
        if (count == 0) {
            return 0;
        }
        return (1.0 * this.number / count);
    }
}
