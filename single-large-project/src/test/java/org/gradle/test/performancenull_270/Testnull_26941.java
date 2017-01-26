package org.gradle.test.performancenull_270;

import static org.junit.Assert.*;

public class Testnull_26941 {
    private final Productionnull_26941 production = new Productionnull_26941("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}