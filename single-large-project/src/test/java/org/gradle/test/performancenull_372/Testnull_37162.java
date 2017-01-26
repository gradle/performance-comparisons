package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37162 {
    private final Productionnull_37162 production = new Productionnull_37162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}