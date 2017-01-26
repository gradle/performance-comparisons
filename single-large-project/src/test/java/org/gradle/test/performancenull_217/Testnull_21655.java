package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21655 {
    private final Productionnull_21655 production = new Productionnull_21655("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}