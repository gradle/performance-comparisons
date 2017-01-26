package org.gradle.test.performancenull_70;

import static org.junit.Assert.*;

public class Testnull_6951 {
    private final Productionnull_6951 production = new Productionnull_6951("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}