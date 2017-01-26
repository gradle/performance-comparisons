package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36290 {
    private final Productionnull_36290 production = new Productionnull_36290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}