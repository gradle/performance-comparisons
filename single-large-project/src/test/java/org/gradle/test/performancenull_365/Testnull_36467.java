package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36467 {
    private final Productionnull_36467 production = new Productionnull_36467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}