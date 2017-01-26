package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1533 {
    private final Productionnull_1533 production = new Productionnull_1533("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}