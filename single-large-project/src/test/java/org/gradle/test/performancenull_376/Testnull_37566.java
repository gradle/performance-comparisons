package org.gradle.test.performancenull_376;

import static org.junit.Assert.*;

public class Testnull_37566 {
    private final Productionnull_37566 production = new Productionnull_37566("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}