package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12442 {
    private final Productionnull_12442 production = new Productionnull_12442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}