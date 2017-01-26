package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2491 {
    private final Productionnull_2491 production = new Productionnull_2491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}