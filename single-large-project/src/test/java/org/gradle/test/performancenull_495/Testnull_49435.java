package org.gradle.test.performancenull_495;

import static org.junit.Assert.*;

public class Testnull_49435 {
    private final Productionnull_49435 production = new Productionnull_49435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}