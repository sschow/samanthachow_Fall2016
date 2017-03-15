package textExcel;

public class TextCell implements Cell {

	private String cellText;
	
	public TextCell(String text){
		cellText = text; 
	}
	
	@Override
	public String abbreviatedCellText() {
		int numCharacters = cellText.length();
		String finalString = cellText;
		if (finalString.length() < 10){
			while (numCharacters < 10){
				finalString += " ";
			}
			return finalString;
		}else{
			finalString = finalString.substring(0,10);
			return finalString;
		}
	}

	@Override
	public String fullCellText() {
		// TODO Auto-generated method stub
		return "\"" + cellText + "\"";
	}

}
