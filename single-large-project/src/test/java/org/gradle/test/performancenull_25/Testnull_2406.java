package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2406 {
    private final Productionnull_2406 production = new Productionnull_2406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}