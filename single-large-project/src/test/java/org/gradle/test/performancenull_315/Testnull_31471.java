package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31471 {
    private final Productionnull_31471 production = new Productionnull_31471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}