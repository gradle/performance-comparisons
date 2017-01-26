package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37294 {
    private final Productionnull_37294 production = new Productionnull_37294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}