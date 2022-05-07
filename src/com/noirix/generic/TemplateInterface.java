package com.noirix.generic;

public interface TemplateInterface<T, R> {

    R process(T param);

}
