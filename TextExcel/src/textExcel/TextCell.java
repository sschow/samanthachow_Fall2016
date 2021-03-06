package textExcel;

public class TextCell implements Cell {

	private String cellText;
	
	public TextCell(String text){
		cellText = text; 
	}
	
	public void setCellText(String text){
		cellText = text;
	}
	 
	public String getCellText(){
		return cellText;
	}
	
	@Override
	public String abbreviatedCellText() {
		int numCharacters = cellText.length();
		String finalString = cellText + "          ";
		finalString = finalString.substring(0,10);
		return finalString;
	}

	@Override
	public String fullCellText() {
		// TODO Auto-generated method stub
		return "\"" + cellText + "\"";
	}

}
