package me.graduation.interfaces.share.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import java.util.Locale;

/**
 * Created by ivan_ on 2015/3/31.
 */
public abstract class BaseController {
    @Autowired
    private MessageSource messageSource;

    private MessageSource getMessageSource() {
        return messageSource;
    }

    protected String getMessage(String code, Object[] parameterArr, Locale locale) {
        return this.getMessageSource().getMessage(code, parameterArr, locale);
    }
}