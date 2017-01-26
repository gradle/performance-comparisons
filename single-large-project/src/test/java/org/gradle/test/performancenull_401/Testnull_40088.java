package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40088 {
    private final Productionnull_40088 production = new Productionnull_40088("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}