public class Dataset {
    private double[] data;
    private int datasize;
    private double sum;

    public Dataset() {
        data = new double[100];
        datasize = 0;
        sum = 0.0;
    }

    public void add(double value) {
        data[datasize] = value;
        datasize++;
        sum += value;}

    public double getAverage() {
        return datasize == 0 ? 0.0 : sum / datasize;
    }

    public double getStandardDeviation() {
        double mean = getAverage();
        double sumOfSquares = 0.0;
        for (int i = 0; i < datasize; i++) {
            double diff = data[i] - mean;
            sumOfSquares += diff * diff;
        }
        return Math.sqrt(sumOfSquares / datasize);
    }

    public static double calculateTotalAverage(Dataset[] datasets) {
        double totalSum = 0.0;
        for (Dataset dataset : datasets) {
            totalSum += dataset.sum;
        }
        return totalSum / datasets.length;
    }

}
