package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40035 {
    private final Productionnull_40035 production = new Productionnull_40035("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}