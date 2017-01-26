package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22429 {
    private final Productionnull_22429 production = new Productionnull_22429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}