package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3143 {
    private final Productionnull_3143 production = new Productionnull_3143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}