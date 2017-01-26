package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37221 {
    private final Productionnull_37221 production = new Productionnull_37221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}