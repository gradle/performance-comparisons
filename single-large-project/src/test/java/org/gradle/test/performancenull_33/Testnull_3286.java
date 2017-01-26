package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3286 {
    private final Productionnull_3286 production = new Productionnull_3286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}