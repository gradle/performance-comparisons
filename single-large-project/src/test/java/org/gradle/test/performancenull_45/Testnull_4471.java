package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4471 {
    private final Productionnull_4471 production = new Productionnull_4471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}