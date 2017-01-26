package org.gradle.test.performancenull_198;

import static org.junit.Assert.*;

public class Testnull_19786 {
    private final Productionnull_19786 production = new Productionnull_19786("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}