package org.gradle.test.performancenull_481;

import static org.junit.Assert.*;

public class Testnull_48081 {
    private final Productionnull_48081 production = new Productionnull_48081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}