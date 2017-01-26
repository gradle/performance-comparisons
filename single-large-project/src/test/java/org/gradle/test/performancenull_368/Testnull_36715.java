package org.gradle.test.performancenull_368;

import static org.junit.Assert.*;

public class Testnull_36715 {
    private final Productionnull_36715 production = new Productionnull_36715("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}