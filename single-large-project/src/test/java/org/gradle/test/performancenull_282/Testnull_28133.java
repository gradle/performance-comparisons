package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28133 {
    private final Productionnull_28133 production = new Productionnull_28133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}