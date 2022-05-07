package com.noirix.generic;

public class TemplateObject<K extends Number, V extends CharSequence> {
    private K key;

    private V value;

    public TemplateObject() {
    }

    public TemplateObject(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
