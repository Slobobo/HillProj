public class TopShop {
    public static void main(String[] args) {

        byte productNumber = 1;
        float totalSales = 12153.41F;
        byte totalDays = 5;
        float salePerDay = totalSales/totalDays;
        String productName = "smarphone,";

        System.out.println("Product No " + productNumber + ": " + productName);
        System.out.println("total sales for " + totalDays + " days is EUR " + totalSales + ",");
        System.out.println("sales by day is EUR " + String.format("%.2f", salePerDay) + ".");


        productNumber = 2;
        totalSales = 10486.85F;
        totalDays = 7;
        salePerDay = totalSales/totalDays;
        productName = "laptop,";

        System.out.println("Product No " + productNumber + ": " + productName);
        System.out.println("total sales for " + totalDays + " days is EUR " + totalSales + ",");
        System.out.println("sales by day is EUR " + String.format("%.2f", salePerDay) + ".");
    }
}
