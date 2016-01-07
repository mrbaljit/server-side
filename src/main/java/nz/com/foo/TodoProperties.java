package nz.com.foo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix="todo", ignoreUnknownFields = true)
public class TodoProperties {

    private String ureHost;
    private String if01EndpointUri;
    private String if02EndpointUri;
    private String aisEndpointUri;
    private String ureRbName;
    private String ureRbVersion;
    private int ureServiceCacheSize;
    private String urePort;

    public String getUreDBName() {
        return ureDBName;
    }

    public void setUreDBName(String ureDBName) {
        this.ureDBName = ureDBName;
    }

    public String getUrePort() {
        return urePort;
    }

    public void setUrePort(String urePort) {
        this.urePort = urePort;
    }

    private String ureDBName;

    public String getUreHost() {
        return ureHost;
    }

    public void setUreHost(String ureHost) {
        this.ureHost = ureHost;
    }

    public String getIf01EndpointUri() {
        return if01EndpointUri;
    }

    public void setIf01EndpointUri(String if01EndpointUri) {
        this.if01EndpointUri = if01EndpointUri;
    }

    public String getIf02EndpointUri() {
        return if02EndpointUri;
    }

    public void setIf02EndpointUri(String if02EndpointUri) {
        this.if02EndpointUri = if02EndpointUri;
    }

    public String getAisEndpointUri() {
        return aisEndpointUri;
    }

    public void setAisEndpointUri(String aisEndpointUri) {
        this.aisEndpointUri = aisEndpointUri;
    }

    public String getUreRbName() {
        return ureRbName;
    }

    public void setUreRbName(String ureRbName) {
        this.ureRbName = ureRbName;
    }

    public String getUreRbVersion() {
        return ureRbVersion;
    }

    public void setUreRbVersion(String ureRbVersion) {
        this.ureRbVersion = ureRbVersion;
    }

    public int getUreServiceCacheSize() {
        return ureServiceCacheSize;
    }

    public void setUreServiceCacheSize(int ureServiceCacheSize) {
        this.ureServiceCacheSize = ureServiceCacheSize;
    }



    public TodoProperties() {}

}
