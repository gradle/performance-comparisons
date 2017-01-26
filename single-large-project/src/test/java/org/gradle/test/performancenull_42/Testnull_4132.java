package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4132 {
    private final Productionnull_4132 production = new Productionnull_4132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}