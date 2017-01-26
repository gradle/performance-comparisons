package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3600 {
    private final Productionnull_3600 production = new Productionnull_3600("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}