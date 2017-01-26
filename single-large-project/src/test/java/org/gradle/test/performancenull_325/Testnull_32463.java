package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32463 {
    private final Productionnull_32463 production = new Productionnull_32463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}