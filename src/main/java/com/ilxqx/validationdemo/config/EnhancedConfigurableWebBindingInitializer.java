package com.ilxqx.validationdemo.config;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;

/**
 * @author venus
 * @version 1.0.0
 * @since 2023/3/24 星期五 23:43
 */
@RequiredArgsConstructor
public class EnhancedConfigurableWebBindingInitializer extends ConfigurableWebBindingInitializer {

    private final Validator validator;

    @Override
    public void initBinder(WebDataBinder binder) {
        super.initBinder(binder);
        binder.addValidators(this.validator);
    }
}
