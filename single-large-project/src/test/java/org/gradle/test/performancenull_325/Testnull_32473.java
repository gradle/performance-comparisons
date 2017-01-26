package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32473 {
    private final Productionnull_32473 production = new Productionnull_32473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}