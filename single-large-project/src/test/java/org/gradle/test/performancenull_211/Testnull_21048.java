package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21048 {
    private final Productionnull_21048 production = new Productionnull_21048("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}