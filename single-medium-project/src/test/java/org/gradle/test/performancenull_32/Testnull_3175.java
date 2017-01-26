package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3175 {
    private final Productionnull_3175 production = new Productionnull_3175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}