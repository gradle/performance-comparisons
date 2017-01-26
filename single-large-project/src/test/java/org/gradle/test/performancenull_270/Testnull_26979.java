package org.gradle.test.performancenull_270;

import static org.junit.Assert.*;

public class Testnull_26979 {
    private final Productionnull_26979 production = new Productionnull_26979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}