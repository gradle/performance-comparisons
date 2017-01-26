package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2104 {
    private final Productionnull_2104 production = new Productionnull_2104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}