package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18498 {
    private final Productionnull_18498 production = new Productionnull_18498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}