package org.gradle.test.performancenull_115;

import static org.junit.Assert.*;

public class Testnull_11492 {
    private final Productionnull_11492 production = new Productionnull_11492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}