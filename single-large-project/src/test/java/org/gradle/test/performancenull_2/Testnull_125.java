package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_125 {
    private final Productionnull_125 production = new Productionnull_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}