package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36489 {
    private final Productionnull_36489 production = new Productionnull_36489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}