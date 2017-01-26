package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18139 {
    private final Productionnull_18139 production = new Productionnull_18139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}