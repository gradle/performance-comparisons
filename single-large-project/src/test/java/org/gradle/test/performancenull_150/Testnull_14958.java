package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14958 {
    private final Productionnull_14958 production = new Productionnull_14958("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}