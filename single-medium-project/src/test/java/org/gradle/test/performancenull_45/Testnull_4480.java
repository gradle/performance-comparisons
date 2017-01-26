package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4480 {
    private final Productionnull_4480 production = new Productionnull_4480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}