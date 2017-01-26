package org.gradle.test.performancenull_316;

import static org.junit.Assert.*;

public class Testnull_31546 {
    private final Productionnull_31546 production = new Productionnull_31546("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}