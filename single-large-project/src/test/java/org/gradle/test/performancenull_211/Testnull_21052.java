package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21052 {
    private final Productionnull_21052 production = new Productionnull_21052("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}