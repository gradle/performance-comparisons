package org.gradle.test.performancenull_481;

import static org.junit.Assert.*;

public class Testnull_48046 {
    private final Productionnull_48046 production = new Productionnull_48046("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}