package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12941 {
    private final Productionnull_12941 production = new Productionnull_12941("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}