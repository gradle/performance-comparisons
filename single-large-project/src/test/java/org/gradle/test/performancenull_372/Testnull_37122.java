package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37122 {
    private final Productionnull_37122 production = new Productionnull_37122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}