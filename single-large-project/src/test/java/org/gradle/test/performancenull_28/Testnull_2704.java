package org.gradle.test.performancenull_28;

import static org.junit.Assert.*;

public class Testnull_2704 {
    private final Productionnull_2704 production = new Productionnull_2704("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}