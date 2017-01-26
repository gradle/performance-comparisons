package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30478 {
    private final Productionnull_30478 production = new Productionnull_30478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}