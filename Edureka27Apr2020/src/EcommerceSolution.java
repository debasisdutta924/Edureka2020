
public class EcommerceSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int flipkartSalesDay1 = 115;
        int flipkartSalesDay2 = 170;
        int flipkartSalesDay3 = 347;
        
        int amazonSalesDay1 = 120;
        int amazonSalesDay2 = 150;
        int amazonSalesDay3 = 375;
        
        double amazonProfit = 1150.22;
        double flipkartProfit = 1011.75;
        
        int amazonTotalSales = amazonSalesDay1 + amazonSalesDay2 + amazonSalesDay3; 
        int flipkartSales =  flipkartSalesDay1 + flipkartSalesDay2 + flipkartSalesDay3;
       
        double amazonTotalProfits = amazonTotalSales * amazonProfit;
        double flipkartTotalProfits = flipkartSales * flipkartProfit;
	  
        System.out.println("Amazon Total Sales "+ amazonTotalSales);
        System.out.println("Amazon Profits : " + amazonTotalProfits);
        
	}

}
