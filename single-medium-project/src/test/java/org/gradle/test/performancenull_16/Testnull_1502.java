package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1502 {
    private final Productionnull_1502 production = new Productionnull_1502("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}