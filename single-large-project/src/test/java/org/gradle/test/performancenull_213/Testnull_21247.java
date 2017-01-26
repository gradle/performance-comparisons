package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21247 {
    private final Productionnull_21247 production = new Productionnull_21247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}