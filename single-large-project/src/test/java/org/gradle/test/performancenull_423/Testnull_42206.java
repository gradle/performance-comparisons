package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42206 {
    private final Productionnull_42206 production = new Productionnull_42206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}