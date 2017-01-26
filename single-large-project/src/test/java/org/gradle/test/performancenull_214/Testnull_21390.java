package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21390 {
    private final Productionnull_21390 production = new Productionnull_21390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}