package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17423 {
    private final Productionnull_17423 production = new Productionnull_17423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}