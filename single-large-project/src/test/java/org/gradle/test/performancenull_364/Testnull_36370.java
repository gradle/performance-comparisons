package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36370 {
    private final Productionnull_36370 production = new Productionnull_36370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}