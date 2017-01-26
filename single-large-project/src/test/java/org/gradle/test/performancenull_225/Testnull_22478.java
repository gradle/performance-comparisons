package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22478 {
    private final Productionnull_22478 production = new Productionnull_22478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}