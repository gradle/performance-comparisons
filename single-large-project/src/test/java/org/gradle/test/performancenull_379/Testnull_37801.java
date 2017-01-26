package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37801 {
    private final Productionnull_37801 production = new Productionnull_37801("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}