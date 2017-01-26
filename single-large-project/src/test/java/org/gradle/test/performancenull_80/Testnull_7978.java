package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7978 {
    private final Productionnull_7978 production = new Productionnull_7978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}