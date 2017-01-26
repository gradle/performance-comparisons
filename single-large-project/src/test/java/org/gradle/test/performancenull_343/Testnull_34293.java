package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34293 {
    private final Productionnull_34293 production = new Productionnull_34293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}