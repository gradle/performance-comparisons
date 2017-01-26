package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3269 {
    private final Productionnull_3269 production = new Productionnull_3269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}