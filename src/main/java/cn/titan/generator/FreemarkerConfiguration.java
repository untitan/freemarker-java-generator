package cn.titan.generator;

import freemarker.template.Configuration;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;
import java.io.Writer;

public class FreemarkerConfiguration {

	private Configuration configuration;

	private String charset = "utf-8";

	public FreemarkerConfiguration(String filePath) throws IOException {
		if (this.configuration == null) {
			this.configuration = new Configuration(Configuration.VERSION_2_3_23);
		}
		configuration.setDefaultEncoding(charset);
		configuration.setDirectoryForTemplateLoading(new File(filePath));
	}

	public void buildCode(String templateName, Object data, Writer writer) throws IOException, TemplateException {
		configuration.getTemplate(templateName).process(data, writer);
	}
}