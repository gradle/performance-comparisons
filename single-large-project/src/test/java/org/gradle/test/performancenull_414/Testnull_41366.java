package org.gradle.test.performancenull_414;

import static org.junit.Assert.*;

public class Testnull_41366 {
    private final Productionnull_41366 production = new Productionnull_41366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}