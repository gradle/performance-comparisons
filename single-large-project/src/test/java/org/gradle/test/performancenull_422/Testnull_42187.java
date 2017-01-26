package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42187 {
    private final Productionnull_42187 production = new Productionnull_42187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}