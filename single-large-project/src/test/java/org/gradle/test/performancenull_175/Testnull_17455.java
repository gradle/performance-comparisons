package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17455 {
    private final Productionnull_17455 production = new Productionnull_17455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}