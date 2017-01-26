package org.gradle.test.performancenull_355;

import static org.junit.Assert.*;

public class Testnull_35426 {
    private final Productionnull_35426 production = new Productionnull_35426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}