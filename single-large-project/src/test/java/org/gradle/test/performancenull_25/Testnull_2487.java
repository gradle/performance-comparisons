package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2487 {
    private final Productionnull_2487 production = new Productionnull_2487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}