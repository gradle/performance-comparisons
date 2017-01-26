package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4469 {
    private final Productionnull_4469 production = new Productionnull_4469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}