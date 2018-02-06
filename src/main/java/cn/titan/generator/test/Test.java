package cn.titan.generator.test;

import cn.titan.generator.FreemarkerConfiguration;
import cn.titan.generator.data.JavaClassData;
import cn.titan.generator.data.Property;
import cn.titan.generator.def.DataType;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException, TemplateException {

		String className = "Hello";
		String packageName = "cn.titan.generator.test";

		String targetFilePath = "/target/generated-sources/" + packageName.replace(".", "/") + "/";
		String targetFile = targetFilePath + className + ".java";
		File file = new File(targetFilePath);
		if (!file.getParentFile().exists()) {
			file.mkdirs();
		}
		FileWriter out = new FileWriter(targetFile);

		JavaClassData data = new JavaClassData();
		data.setClassName(className);
		data.setPackageName(packageName);
		data.addProperty(new Property("name", DataType.String));
		data.addProperty(new Property("value", DataType.BigDecimal));
		data.addProperty(new Property("date", DataType.Date));

		FreemarkerConfiguration gen = new FreemarkerConfiguration("src/main/resources/template");
		gen.buildCode("java.ftl", data, out);
	}
}
