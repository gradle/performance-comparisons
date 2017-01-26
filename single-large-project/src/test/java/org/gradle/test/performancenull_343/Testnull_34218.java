package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34218 {
    private final Productionnull_34218 production = new Productionnull_34218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}