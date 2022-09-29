package {{cookiecutter.groupId}}.{{cookiecutter.artifactIdLower}}.configuration;

import {{cookiecutter.groupId}}.{{cookiecutter.artifactId.replace("-", "").lower().lower()}}.{{cookiecutter.name}};
import {{cookiecutter.groupId}}.{{cookiecutter.artifactIdLower}}.properties.{{cookiecutter.name}}Properties;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
@ConditionalOnClass({{cookiecutter.name}}.class)
@EnableConfigurationProperties({{cookiecutter.name}}Properties.class)
public class {{cookiecutter.name}}AutoConfiguration {

    private final {{cookiecutter.name}}Properties properties;

    @Bean
    @ConditionalOnMissingBean
    public {{cookiecutter.name}} provideAutoconfiguration() {
        return new {{cookiecutter.name}}();
    }

}
