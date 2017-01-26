package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5990 {
    private final Productionnull_5990 production = new Productionnull_5990("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}