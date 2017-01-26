package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17410 {
    private final Productionnull_17410 production = new Productionnull_17410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}