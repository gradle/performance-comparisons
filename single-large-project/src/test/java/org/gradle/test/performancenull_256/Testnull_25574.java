package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25574 {
    private final Productionnull_25574 production = new Productionnull_25574("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}