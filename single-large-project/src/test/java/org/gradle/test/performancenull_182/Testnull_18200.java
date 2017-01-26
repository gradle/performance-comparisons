package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18200 {
    private final Productionnull_18200 production = new Productionnull_18200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}