package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20390 {
    private final Productionnull_20390 production = new Productionnull_20390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}