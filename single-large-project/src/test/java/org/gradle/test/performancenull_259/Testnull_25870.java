package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25870 {
    private final Productionnull_25870 production = new Productionnull_25870("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}