package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18198 {
    private final Productionnull_18198 production = new Productionnull_18198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}