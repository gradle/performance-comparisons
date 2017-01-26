package org.gradle.test.performancenull_405;

import static org.junit.Assert.*;

public class Testnull_40482 {
    private final Productionnull_40482 production = new Productionnull_40482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}