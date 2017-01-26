package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17413 {
    private final Productionnull_17413 production = new Productionnull_17413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}