package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3103 {
    private final Productionnull_3103 production = new Productionnull_3103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}