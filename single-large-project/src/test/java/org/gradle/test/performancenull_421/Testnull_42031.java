package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42031 {
    private final Productionnull_42031 production = new Productionnull_42031("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}