package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34223 {
    private final Productionnull_34223 production = new Productionnull_34223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}