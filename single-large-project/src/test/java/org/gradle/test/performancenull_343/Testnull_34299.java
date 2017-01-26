package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34299 {
    private final Productionnull_34299 production = new Productionnull_34299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}