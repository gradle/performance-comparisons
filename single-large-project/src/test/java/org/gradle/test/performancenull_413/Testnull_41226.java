package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41226 {
    private final Productionnull_41226 production = new Productionnull_41226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}