package org.gradle.test.performancenull_186;

import static org.junit.Assert.*;

public class Testnull_18576 {
    private final Productionnull_18576 production = new Productionnull_18576("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}