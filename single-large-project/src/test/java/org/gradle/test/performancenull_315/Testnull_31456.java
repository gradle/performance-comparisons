package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31456 {
    private final Productionnull_31456 production = new Productionnull_31456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}