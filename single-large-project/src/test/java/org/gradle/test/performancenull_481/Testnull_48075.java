package org.gradle.test.performancenull_481;

import static org.junit.Assert.*;

public class Testnull_48075 {
    private final Productionnull_48075 production = new Productionnull_48075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}