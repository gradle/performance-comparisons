package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34286 {
    private final Productionnull_34286 production = new Productionnull_34286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}