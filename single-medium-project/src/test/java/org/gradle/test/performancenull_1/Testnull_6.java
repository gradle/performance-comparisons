package org.gradle.test.performancenull_1;

import static org.junit.Assert.*;

public class Testnull_6 {
    private final Productionnull_6 production = new Productionnull_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}