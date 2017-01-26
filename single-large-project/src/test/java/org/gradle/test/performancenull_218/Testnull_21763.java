package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21763 {
    private final Productionnull_21763 production = new Productionnull_21763("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}