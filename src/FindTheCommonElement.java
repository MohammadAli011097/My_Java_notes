
public class FindTheCommonElement {

	public void find(int[] num1,int []	num2) {
		
		for(int i= 0;i<num1.length;i++) {
			for(int j=0; j<num2.length;j++) {
				
				if(num1[i]==num2[j]) {
					
					System.out.print(num2[j]);
					
				}
				
			}
			
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] num1 = {1,2,3,4,5,6,7,8,9};	
	int []	num2 = {1,2,10};
		
	 FindTheCommonElement cl = new  FindTheCommonElement();
	 
	 cl.find(num1, num2);
	
	}

}
