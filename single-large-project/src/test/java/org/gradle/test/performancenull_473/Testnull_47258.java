package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47258 {
    private final Productionnull_47258 production = new Productionnull_47258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}