package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{

	private EmptyCell[][] data;
	
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
	public String getGridText()
	{
		// TODO Auto-generated method stub
		return null;
	}

}