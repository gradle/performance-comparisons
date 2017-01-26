package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36293 {
    private final Productionnull_36293 production = new Productionnull_36293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}