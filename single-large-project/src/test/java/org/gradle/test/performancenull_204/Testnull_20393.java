package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20393 {
    private final Productionnull_20393 production = new Productionnull_20393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}