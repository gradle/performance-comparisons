package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37269 {
    private final Productionnull_37269 production = new Productionnull_37269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}