package org.gradle.test.performancenull_428;

import static org.junit.Assert.*;

public class Testnull_42785 {
    private final Productionnull_42785 production = new Productionnull_42785("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}