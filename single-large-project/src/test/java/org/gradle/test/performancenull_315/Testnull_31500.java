package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31500 {
    private final Productionnull_31500 production = new Productionnull_31500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}