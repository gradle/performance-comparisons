package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3246 {
    private final Productionnull_3246 production = new Productionnull_3246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}