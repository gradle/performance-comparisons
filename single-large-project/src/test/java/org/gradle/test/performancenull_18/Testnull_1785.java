package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1785 {
    private final Productionnull_1785 production = new Productionnull_1785("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}