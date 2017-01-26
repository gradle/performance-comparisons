package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37500 {
    private final Productionnull_37500 production = new Productionnull_37500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}