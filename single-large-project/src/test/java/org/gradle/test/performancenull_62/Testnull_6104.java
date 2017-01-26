package org.gradle.test.performancenull_62;

import static org.junit.Assert.*;

public class Testnull_6104 {
    private final Productionnull_6104 production = new Productionnull_6104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}