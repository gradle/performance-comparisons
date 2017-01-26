package org.gradle.test.performancenull_484;

import static org.junit.Assert.*;

public class Testnull_48354 {
    private final Productionnull_48354 production = new Productionnull_48354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}