public class main {

    public static void main(String[] args) {
        Dataset dataset1 = new Dataset();
        dataset1.add(10.0);
        dataset1.add(20.0);
        dataset1.add(30.0);
        System.out.println("Average of dataset1: " + dataset1.getAverage());

        Dataset[] datasets = new Dataset[2];

        Dataset dataset2 = new Dataset();
        dataset2.add(15.0);
        dataset2.add(25.0);
        datasets[0] = dataset1;
        datasets[1] = dataset2;

        Profile Image

DataSet ds3 = new DataSet();

ds3.add(10);

ds3.add(20);

datasets[0] = ds1;

datasets[1] = ds2;

datasets[2] = ds3;

System.out.println("Average of Averages: " + DataSet.calculateTotalAverage(datasets));

}

        



}