package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20356 {
    private final Productionnull_20356 production = new Productionnull_20356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}