package org.gradle.test.performancenull_198;

import static org.junit.Assert.*;

public class Testnull_19709 {
    private final Productionnull_19709 production = new Productionnull_19709("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}