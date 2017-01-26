package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47228 {
    private final Productionnull_47228 production = new Productionnull_47228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}