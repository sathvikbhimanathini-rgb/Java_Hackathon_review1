class WasteCalculator
{
    double calculateTotalWaste(double point1Waste, double point2Waste)
    {
    return point1Waste + point2Waste;
    }

    public static void main(String args[])
    {
        WasteCalculator sc=new WasteCalculator();
        double totalWaste=sc.calculateTotalWaste(10.5, 20.3);
        System.out.println("Total Waste: " + totalWaste);
    }
}