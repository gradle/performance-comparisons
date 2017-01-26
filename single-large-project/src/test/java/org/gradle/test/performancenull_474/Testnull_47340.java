package org.gradle.test.performancenull_474;

import static org.junit.Assert.*;

public class Testnull_47340 {
    private final Productionnull_47340 production = new Productionnull_47340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}