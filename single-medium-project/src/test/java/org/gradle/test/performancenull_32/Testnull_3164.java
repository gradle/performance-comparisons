package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3164 {
    private final Productionnull_3164 production = new Productionnull_3164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}