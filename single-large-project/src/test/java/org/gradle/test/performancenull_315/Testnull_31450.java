package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31450 {
    private final Productionnull_31450 production = new Productionnull_31450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}