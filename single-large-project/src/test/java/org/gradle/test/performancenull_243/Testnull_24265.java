package org.gradle.test.performancenull_243;

import static org.junit.Assert.*;

public class Testnull_24265 {
    private final Productionnull_24265 production = new Productionnull_24265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}