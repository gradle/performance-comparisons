package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34430 {
    private final Productionnull_34430 production = new Productionnull_34430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}