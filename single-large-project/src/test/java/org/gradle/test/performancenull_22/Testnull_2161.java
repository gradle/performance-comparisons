package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2161 {
    private final Productionnull_2161 production = new Productionnull_2161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}