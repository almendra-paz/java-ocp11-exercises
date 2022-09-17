class ThrowingExceptions{
	
	public static void main(String args[]){
		public void bad(){
			try{
				eatCarrot();
			}catch(NoMoreCarrotsException e){
				System.out.println("error");
			}
		}

		public void good() throws NoMoreCarrotsException {
			eatCarrot();
		}

		private void eatCarrot(){ }

	}	
}