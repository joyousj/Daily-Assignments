//Enum for print number in word class and num class
public enum EnumNumAndWord {
	 ONE(1), 
	 TWO(2),
	 THREE(3),
	 FOUR(4),
	 FIVE(5),
	 SIX(6),
	 SEVEN(7),
	 EIGHT(8),
	 NINE(9),
	 OTHER(10);
	 
	private int value;
	 
	private EnumNumAndWord(int value) {
		this.value = value;
	}
	public int getNum() {
		return value;
	}
}
