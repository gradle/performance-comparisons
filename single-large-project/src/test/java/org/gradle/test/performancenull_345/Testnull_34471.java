package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34471 {
    private final Productionnull_34471 production = new Productionnull_34471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}