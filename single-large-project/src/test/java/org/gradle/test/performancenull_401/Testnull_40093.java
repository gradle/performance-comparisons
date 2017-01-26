package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40093 {
    private final Productionnull_40093 production = new Productionnull_40093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}