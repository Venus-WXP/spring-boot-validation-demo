package com.ilxqx.validationdemo.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

/**
 * @author venus
 * @version 1.0.0
 * @since 2023/3/24 星期五 23:42
 */
@Component
public class ConfigurableWebBindingInitializerReplacer implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof RequestMappingHandlerAdapter handlerAdapter) {
            ConfigurableWebBindingInitializer configurableWebBindingInitializer = (ConfigurableWebBindingInitializer) handlerAdapter.getWebBindingInitializer();
            EnhancedSmartValidator validator = new EnhancedSmartValidator(configurableWebBindingInitializer.getValidator());
            EnhancedConfigurableWebBindingInitializer initializer = new EnhancedConfigurableWebBindingInitializer(validator);
            initializer.setConversionService(configurableWebBindingInitializer.getConversionService());
            initializer.setValidator(configurableWebBindingInitializer.getValidator());
            initializer.setDirectFieldAccess(true);
            initializer.setMessageCodesResolver(configurableWebBindingInitializer.getMessageCodesResolver());
            initializer.setBindingErrorProcessor(configurableWebBindingInitializer.getBindingErrorProcessor());

            handlerAdapter.setWebBindingInitializer(initializer);
        }

        return bean;
    }
}
