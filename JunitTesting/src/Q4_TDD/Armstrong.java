package Q4_TDD;

public class Armstrong {

	public int ArmstrongNumber(int number) {
		
		int temp,sum=0;
 
        temp=number;
        while(number>0)
        {
            int r=number%10;
            sum=sum+(r*r*r);
            number=number/10;
        }
        if(temp==sum){
            System.out.println("number is armstrong");
        }
        else{
            System.out.println("number is not armstrong");
        }
				return sum;
	}
}
