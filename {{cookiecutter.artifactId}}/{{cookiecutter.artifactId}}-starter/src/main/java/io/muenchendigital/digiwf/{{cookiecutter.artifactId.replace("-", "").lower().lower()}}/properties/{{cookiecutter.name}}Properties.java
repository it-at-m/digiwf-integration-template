package {{cookiecutter.groupId}}.{{cookiecutter.artifactId.replace("-", "").lower()}}.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Setter
@Getter
@ConfigurationProperties(prefix = "{{cookiecutter.groupId}}.{{cookiecutter.artifactId}}")
public class {{cookiecutter.name}}Properties {

}
