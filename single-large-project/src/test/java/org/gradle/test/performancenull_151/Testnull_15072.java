package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15072 {
    private final Productionnull_15072 production = new Productionnull_15072("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}