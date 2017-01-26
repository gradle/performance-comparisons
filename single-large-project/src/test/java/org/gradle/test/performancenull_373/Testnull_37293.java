package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37293 {
    private final Productionnull_37293 production = new Productionnull_37293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}