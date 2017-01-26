package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48473 {
    private final Productionnull_48473 production = new Productionnull_48473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}