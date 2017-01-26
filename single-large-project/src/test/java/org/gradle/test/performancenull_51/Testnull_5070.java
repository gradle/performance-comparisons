package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5070 {
    private final Productionnull_5070 production = new Productionnull_5070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}