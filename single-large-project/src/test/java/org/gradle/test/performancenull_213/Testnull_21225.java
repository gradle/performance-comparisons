package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21225 {
    private final Productionnull_21225 production = new Productionnull_21225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}