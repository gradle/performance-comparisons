package org.gradle.test.performancenull_341;

import static org.junit.Assert.*;

public class Testnull_34029 {
    private final Productionnull_34029 production = new Productionnull_34029("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}