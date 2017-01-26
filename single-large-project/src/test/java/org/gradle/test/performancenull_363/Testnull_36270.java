package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36270 {
    private final Productionnull_36270 production = new Productionnull_36270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}