package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2200 {
    private final Productionnull_2200 production = new Productionnull_2200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}