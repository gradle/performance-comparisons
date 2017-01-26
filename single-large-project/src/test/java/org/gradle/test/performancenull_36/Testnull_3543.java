package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3543 {
    private final Productionnull_3543 production = new Productionnull_3543("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}