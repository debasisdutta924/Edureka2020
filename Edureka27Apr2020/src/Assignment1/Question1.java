package Assignment1;

// Write programs to use all the data types and given arithmetic operations.
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteA,byteB;
		byte byteSum,byteMultiply,byteSub,byteDivision;
		
		short shortA,shortB,shortSum;
		short shortMultiply,shortSub,shortDiv;
		
		int integerA,integerB;
		int integerSum,integerMultiply,integerSub,integerDiv;
		
		long longA,longB;
		long longSum,longMultiply,longSub,longDiv;
		
		float floatA,floatB,floatSum;
		float floatSub,floatMultiply,floatDiv;
		
		double doubleA,doubleB;
		double doubleSub,doubleMultiply,doubleDiv,doubleSum;
		        
		boolean isCalculate = true;
		
		System.out.println("The Calculation of byte type");
		byteA =(byte) 4; // Loss if data, not recommended 
		byteB = 2;
		System.out.println(byteA);
        byteSum =(byte) (byteA + byteB);
        byteSub = (byte) (byteA - byteB);
        byteMultiply = (byte) (byteA * byteB);
        byteDivision = (byte) (byteA/byteB);
        System.out.println("The Byte Sum A and B  Value "+byteSum);
        System.out.println("The Byte Subtraction A and B Value "+ byteSub);
        System.out.println("The Byte division A and B  Value " + byteDivision);
        System.out.println("The Byte multiply A and B  Value "+ byteMultiply);
        System.out.println("=========================================");
    
    System.out.println("The Calculation of Short type");
	shortA = 4;
	shortB = 2;
    shortSum =(short) (shortA + shortB);
    shortSub = (short) (shortA - shortB);
    shortMultiply = (short) (shortA * shortB);
    shortDiv = (short) (shortA/shortB);
    System.out.println("The Short Sum A and B Value "+shortSum);
    System.out.println("The Short Subtraction A and B Value "+ shortSub);
    System.out.println("The Short division A and B  Value " + shortDiv);
    System.out.println("The Short multiply A and B Value "+ shortMultiply);
    System.out.println("=========================================");
	
    System.out.println("The Calculation of Integer type");
	integerA = 4;
	integerB = 2;
    integerSum =integerA + integerB;
    integerSub = integerA - integerB;
    integerMultiply = integerA * integerB;
    integerDiv = integerA/integerB;
    System.out.println("The Integer Sum A and B  Value "+integerSum);
    System.out.println("The Integer Subtraction A and B  Value "+ integerSub);
    System.out.println("The Integer division A and B  Value " + integerDiv);
    System.out.println("The Integer multiply A and B  Value "+ integerMultiply);
    System.out.println("=========================================");
   
    System.out.println("The Calculation of Long type");
	longA = 4;
	longB = 2;
    longSum = longA + longB;
    longSub = longA - longB;
    longMultiply = longA * longB;
    longDiv = longA/integerB;
    System.out.println("The Long Sum A and B  Value "+longSum);
    System.out.println("The Long Subtraction A and B  Value "+ longSub);
    System.out.println("The Long division A and B  Value " + longDiv);
    System.out.println("The Long multiply A and B  Value "+ longMultiply);
    System.out.println("=========================================");
    
    
	System.out.println("The Calculation of Float type");
	floatA = 4F;
	floatB = 2F;
    floatSum =floatA + floatB;
    floatSub = floatA - floatB;
    floatMultiply = floatA * floatB;
    floatDiv = floatA/floatB;
    System.out.println("The Float Sum Value "+floatSum);
    System.out.println("The Float Subtraction Value "+ floatSub);
    System.out.println("The Float division Value " + floatDiv);
    System.out.println("The Float multiply Value "+ floatMultiply);
    System.out.println("=========================================");
    
	System.out.println("The Calculation of Double type");
	doubleA = 4;
	doubleB = 2;
    doubleSum =doubleA + doubleB;
    doubleSub = doubleA - doubleB;
    doubleMultiply = doubleA * doubleB;
    doubleDiv = doubleA/doubleB;
    System.out.println("The Double Sum Value "+doubleSum);
    System.out.println("The Double Subtraction Value "+ doubleSub);
    System.out.println("The Double division Value " + doubleDiv);
    System.out.println("The Double multiply Value "+ doubleMultiply);
    
    System.out.println("=========================================");
		
	
		

	}

}
