package cn.titan.generator.data;

import cn.titan.generator.def.DataType;

public class Property {

	public Property(String propertyName, DataType propertyType) {
		this.propertyName = propertyName;
		this.propertyType = propertyType;
	}

	private String propertyName;
	private DataType propertyType;

	public String getPropertyName() {
		return propertyName;
	}

	public DataType getPropertyType() {
		return propertyType;
	}
}

