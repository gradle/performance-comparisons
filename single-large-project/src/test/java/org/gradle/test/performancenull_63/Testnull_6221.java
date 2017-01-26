package org.gradle.test.performancenull_63;

import static org.junit.Assert.*;

public class Testnull_6221 {
    private final Productionnull_6221 production = new Productionnull_6221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}