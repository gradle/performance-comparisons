package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2068 {
    private final Productionnull_2068 production = new Productionnull_2068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}