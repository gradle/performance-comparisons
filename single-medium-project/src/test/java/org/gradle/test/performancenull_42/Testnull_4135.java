package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4135 {
    private final Productionnull_4135 production = new Productionnull_4135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}