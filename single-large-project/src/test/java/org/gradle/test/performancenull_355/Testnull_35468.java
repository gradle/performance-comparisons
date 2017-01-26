package org.gradle.test.performancenull_355;

import static org.junit.Assert.*;

public class Testnull_35468 {
    private final Productionnull_35468 production = new Productionnull_35468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}