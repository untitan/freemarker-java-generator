package cn.titan.generator.def;

public enum DataType {
	String("java.lang.String", false),
	Integer("java.lang.Integer", true),
	BigDecimal("java.math.BigDecimal", true),
	Date("java.util.Date", true);

	private String type;
	private boolean isImport;

	DataType(String type, boolean isImport) {
		this.type = type;
		this.isImport = isImport;
	}

	public String getType() {
		return this.type;
	}

	public boolean isImport() {
		return this.isImport;
	}

	public static String getDataType(String type) {
		return DataType.valueOf(type).getType();
	}
}