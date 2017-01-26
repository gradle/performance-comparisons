package org.gradle.test.performancenull_406;

import static org.junit.Assert.*;

public class Testnull_40529 {
    private final Productionnull_40529 production = new Productionnull_40529("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}