package org.gradle.test.performancenull_13;

import static org.junit.Assert.*;

public class Testnull_1206 {
    private final Productionnull_1206 production = new Productionnull_1206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}