package org.gradle.test.performancenull_124;

import static org.junit.Assert.*;

public class Testnull_12400 {
    private final Productionnull_12400 production = new Productionnull_12400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}