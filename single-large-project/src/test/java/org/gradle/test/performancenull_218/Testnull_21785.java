package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21785 {
    private final Productionnull_21785 production = new Productionnull_21785("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}