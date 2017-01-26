package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31468 {
    private final Productionnull_31468 production = new Productionnull_31468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}