package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37129 {
    private final Productionnull_37129 production = new Productionnull_37129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}