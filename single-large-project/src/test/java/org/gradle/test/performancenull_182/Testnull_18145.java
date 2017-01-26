package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18145 {
    private final Productionnull_18145 production = new Productionnull_18145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}