package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6309 {
    private final Productionnull_6309 production = new Productionnull_6309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}