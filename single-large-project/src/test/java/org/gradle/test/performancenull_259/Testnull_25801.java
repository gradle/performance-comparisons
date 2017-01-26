package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25801 {
    private final Productionnull_25801 production = new Productionnull_25801("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}