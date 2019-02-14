package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		String str = String.valueOf(number);
		int result = 0;
		
		String abc = str+ "";
		for (int i = 0; i < str.length(); i++) {
			String qwe = abc.substring(i,i+1);
			if (qwe.equals("3") || qwe.equals("6") || qwe.equals("9")) {
				result++;
			}
		}
		return result;
		
	}
}