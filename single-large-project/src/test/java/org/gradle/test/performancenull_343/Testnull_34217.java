package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34217 {
    private final Productionnull_34217 production = new Productionnull_34217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}