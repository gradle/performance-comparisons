package org.gradle.test.performancenull_184;

import static org.junit.Assert.*;

public class Testnull_18327 {
    private final Productionnull_18327 production = new Productionnull_18327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}