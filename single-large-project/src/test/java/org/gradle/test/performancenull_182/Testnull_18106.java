package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18106 {
    private final Productionnull_18106 production = new Productionnull_18106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}