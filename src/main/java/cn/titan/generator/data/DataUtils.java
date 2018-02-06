package cn.titan.generator.data;

import cn.titan.generator.def.DataType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataUtils {
	private String packageName;
	private String className;
	private List<String> imports = new ArrayList<String>();
	private List<Property> propertys = new ArrayList<Property>();

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<String> getImports() {
		return imports;
	}

	public void setImports(List<String> imports) {
		this.imports = imports;
	}

	public List<Property> getPropertys() {
		return propertys;
	}

	public void setPropertys(List<Property> propertys) {
		this.propertys = propertys;
	}

	public String getType(String type) {
		return DataType.getDataType(type);
	}

	private void addImports(String... impt) {
		this.imports.addAll(Arrays.asList(impt));
	}

	public void addProperty(Property property) {
		if (property.getPropertyType().isImport()) {
			this.addImports(property.getPropertyType().getType());
		} else {

		}
		propertys.add(property);
	}

	public String up(String propertyName) {
		return propertyName.substring(0, 1).toUpperCase() + propertyName.substring(1);
	}

	public String low(String propertyName) {
		return propertyName.toLowerCase();
	}
}
