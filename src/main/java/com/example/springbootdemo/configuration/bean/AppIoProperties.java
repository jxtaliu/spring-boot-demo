package com.example.springbootdemo.configuration.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;

/**
 * Spring Framework has a DataSize value type that allows to express size in bytes.
 * If you expose a DataSize property, the following formats in application properties are available:
 *
 * A regular long representation (using bytes as the default
 * unit unless a @DataSizeUnit has been specified)
 * A more readable format where the value and the unit are coupled (e.g. 10MB means 10 megabytes)
 *
 * @author : bruceliu(jxta.liu@gmail.com)
 * @version V1.0
 * @Project: spring-boot-demo
 * @Package com.example.springbootdemo.configuration.bean
 * @Description: TODO
 * @date Date : 2019年09月25日 14:32
 */
@ConfigurationProperties("app.io")
public class AppIoProperties {
    @DataSizeUnit(DataUnit.MEGABYTES)
    private DataSize bufferSize = DataSize.ofMegabytes(2);

    private DataSize sizeThreshold = DataSize.ofBytes(512);

    public DataSize getBufferSize() {
        return this.bufferSize;
    }

    public void setBufferSize(DataSize bufferSize) {
        this.bufferSize = bufferSize;
    }

    public DataSize getSizeThreshold() {
        return this.sizeThreshold;
    }

    public void setSizeThreshold(DataSize sizeThreshold) {
        this.sizeThreshold = sizeThreshold;
    }
}
