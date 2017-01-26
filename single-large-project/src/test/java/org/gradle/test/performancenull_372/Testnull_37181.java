package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37181 {
    private final Productionnull_37181 production = new Productionnull_37181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}