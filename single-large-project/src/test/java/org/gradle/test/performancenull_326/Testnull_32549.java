package org.gradle.test.performancenull_326;

import static org.junit.Assert.*;

public class Testnull_32549 {
    private final Productionnull_32549 production = new Productionnull_32549("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}