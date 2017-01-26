package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34256 {
    private final Productionnull_34256 production = new Productionnull_34256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}