package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20354 {
    private final Productionnull_20354 production = new Productionnull_20354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}