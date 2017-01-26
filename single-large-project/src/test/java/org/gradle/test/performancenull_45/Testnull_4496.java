package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4496 {
    private final Productionnull_4496 production = new Productionnull_4496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}