package ${packageName};

<#if imports ? exists>
    <#list imports as impt>
import ${impt};
    </#list>
</#if>

public class ${className} {

<#list propertys as property>
    private ${property.propertyType} ${property.propertyName};
</#list>

<#list propertys as property>
    public ${property.propertyType} get${up(property.propertyName)}(){ return this.${property.propertyName};}
    public void set${up(property.propertyName)}(${property.propertyType} ${up(property.propertyName)}){ this.${property.propertyName} = ${property.propertyName};}
</#list>
}