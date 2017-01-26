package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22419 {
    private final Productionnull_22419 production = new Productionnull_22419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}