package org.gradle.test.performancenull_17;

import static org.junit.Assert.*;

public class Testnull_1603 {
    private final Productionnull_1603 production = new Productionnull_1603("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}