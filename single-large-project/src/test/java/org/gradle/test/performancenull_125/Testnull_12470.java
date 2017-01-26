package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12470 {
    private final Productionnull_12470 production = new Productionnull_12470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}