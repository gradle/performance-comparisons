package org.gradle.test.performancenull_12;

import static org.junit.Assert.*;

public class Testnull_1128 {
    private final Productionnull_1128 production = new Productionnull_1128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}