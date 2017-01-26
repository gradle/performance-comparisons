package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21889 {
    private final Productionnull_21889 production = new Productionnull_21889("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}