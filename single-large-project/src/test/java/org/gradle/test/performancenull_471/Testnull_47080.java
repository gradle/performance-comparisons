package org.gradle.test.performancenull_471;

import static org.junit.Assert.*;

public class Testnull_47080 {
    private final Productionnull_47080 production = new Productionnull_47080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}