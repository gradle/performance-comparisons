package org.gradle.test.performancenull_257;

import static org.junit.Assert.*;

public class Testnull_25603 {
    private final Productionnull_25603 production = new Productionnull_25603("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}