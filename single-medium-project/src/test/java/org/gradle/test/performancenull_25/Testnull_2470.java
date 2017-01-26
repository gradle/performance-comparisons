package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2470 {
    private final Productionnull_2470 production = new Productionnull_2470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}