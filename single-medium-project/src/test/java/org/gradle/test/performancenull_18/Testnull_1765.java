package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1765 {
    private final Productionnull_1765 production = new Productionnull_1765("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}