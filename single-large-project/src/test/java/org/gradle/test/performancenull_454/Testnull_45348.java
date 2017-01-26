package org.gradle.test.performancenull_454;

import static org.junit.Assert.*;

public class Testnull_45348 {
    private final Productionnull_45348 production = new Productionnull_45348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}