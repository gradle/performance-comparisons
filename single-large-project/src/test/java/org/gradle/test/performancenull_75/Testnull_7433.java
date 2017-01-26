package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7433 {
    private final Productionnull_7433 production = new Productionnull_7433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}