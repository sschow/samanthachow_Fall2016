package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{

	private Cell[][] data;
	private String letters = "ABCDEFJHIJKLMNOPQRSTUVWXYZ";

	
	public Spreadsheet() {
		data = new EmptyCell[20][12];
	}

	@Override
	public String processCommand(String command){
		// TODO Auto-generated method stub
		// 
		//if/else, order matters
		//inspect cells
		//assign string
		//clear all
		//clear cell
		return command;
	}

	public int getRows(){
		int rows = data.length;
		return rows;
	}

	public int getCols(){
		int columns = data[0].length;
		return columns;
	}

	@Override
	public Cell getCell(Location loc)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGridText(){
		
//		for (int i = 0; i < 12; i++){
//			System.out.print("|" + letters.charAt(i) + "         ");
//		}	        
//		System.out.print("|");
//		int counter = 0;
//		for(int j = 0; j < data.length ; j++){
//			counter++;
//			for(int k = 0; k < data[0].length; k++ ){
//				if (counter < 10){
//					System.out.print(counter + "  ");
//				}else{
//					System.out.print(counter + " ");
//				}
//				System.out.print("|");
//				for(int a = 0; a < 10; a++){
//					System.out.print(" ");
//				}
//			}
//			System.out.print("|");
//		}

		return null;
	}

}
