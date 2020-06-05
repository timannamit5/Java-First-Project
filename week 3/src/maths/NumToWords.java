package maths;

public class NumToWords {

	private String[] oneWord = {"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	private String[] tweWord= {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven", "twelve", "thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	private String[] tensWord = {"crore","lakh","thousand","hundred","only"};
	long [] nVal = {10000000,100000,1000,100,1};
	String word = "";
	
	public String convert(long num) {
		
		for(int i=0;i<tensWord.length;i++)
		{
			int v = (int) (num/nVal[i]);
			num = num%nVal[i];
			
			if(v>0)
			{
				if(v>19)
				{
					word+= oneWord[v/10]+ " " + tweWord[v%10] + " " + tensWord[i] + " ";
				}
				else
				{
					word+= tweWord[v] + " " + tensWord[i]+" ";
				}
				
			}
		}
		
		return word;
	}

}
