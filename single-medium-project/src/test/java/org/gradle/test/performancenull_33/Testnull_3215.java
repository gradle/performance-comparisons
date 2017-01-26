package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3215 {
    private final Productionnull_3215 production = new Productionnull_3215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}