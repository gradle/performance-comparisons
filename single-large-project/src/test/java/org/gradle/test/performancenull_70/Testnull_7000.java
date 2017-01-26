package org.gradle.test.performancenull_70;

import static org.junit.Assert.*;

public class Testnull_7000 {
    private final Productionnull_7000 production = new Productionnull_7000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}