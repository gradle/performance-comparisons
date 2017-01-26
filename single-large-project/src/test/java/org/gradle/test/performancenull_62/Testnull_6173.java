package org.gradle.test.performancenull_62;

import static org.junit.Assert.*;

public class Testnull_6173 {
    private final Productionnull_6173 production = new Productionnull_6173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}