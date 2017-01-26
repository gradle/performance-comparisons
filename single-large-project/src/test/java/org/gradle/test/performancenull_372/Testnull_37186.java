package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37186 {
    private final Productionnull_37186 production = new Productionnull_37186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}