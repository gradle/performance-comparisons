package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18487 {
    private final Productionnull_18487 production = new Productionnull_18487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}