package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41267 {
    private final Productionnull_41267 production = new Productionnull_41267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}