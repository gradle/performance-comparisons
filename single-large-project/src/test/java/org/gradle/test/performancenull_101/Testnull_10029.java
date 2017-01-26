package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10029 {
    private final Productionnull_10029 production = new Productionnull_10029("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}