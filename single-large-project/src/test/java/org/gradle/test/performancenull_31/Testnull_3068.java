package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3068 {
    private final Productionnull_3068 production = new Productionnull_3068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}