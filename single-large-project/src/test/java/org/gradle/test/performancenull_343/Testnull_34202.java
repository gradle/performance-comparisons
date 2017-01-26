package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34202 {
    private final Productionnull_34202 production = new Productionnull_34202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}