package org.gradle.test.performancenull_316;

import static org.junit.Assert.*;

public class Testnull_31572 {
    private final Productionnull_31572 production = new Productionnull_31572("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}