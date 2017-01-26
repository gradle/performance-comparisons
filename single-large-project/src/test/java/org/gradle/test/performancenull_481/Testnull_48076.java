package org.gradle.test.performancenull_481;

import static org.junit.Assert.*;

public class Testnull_48076 {
    private final Productionnull_48076 production = new Productionnull_48076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}