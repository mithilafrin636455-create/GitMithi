class string01{
		
		public static void main(String args[]){
			String s1 = "Hello";  
			String s2 = "Hello";
			String s3 = s1;
			if(s1 == s2){
				System.out.println("True");
			}
			else{
				System.out.println("False");
			}
			if(s1.equals(s2)){
				System.out.println("True");
			}
			else{
				System.out.println("False");
			}
		}	
}