package org.gradle.test.performancenull_13;

import static org.junit.Assert.*;

public class Testnull_1221 {
    private final Productionnull_1221 production = new Productionnull_1221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}