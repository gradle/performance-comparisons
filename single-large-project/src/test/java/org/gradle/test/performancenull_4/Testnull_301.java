package org.gradle.test.performancenull_4;

import static org.junit.Assert.*;

public class Testnull_301 {
    private final Productionnull_301 production = new Productionnull_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}