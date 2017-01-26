package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1763 {
    private final Productionnull_1763 production = new Productionnull_1763("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}