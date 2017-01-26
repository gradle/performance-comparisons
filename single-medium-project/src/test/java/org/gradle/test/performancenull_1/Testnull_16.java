package org.gradle.test.performancenull_1;

import static org.junit.Assert.*;

public class Testnull_16 {
    private final Productionnull_16 production = new Productionnull_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}