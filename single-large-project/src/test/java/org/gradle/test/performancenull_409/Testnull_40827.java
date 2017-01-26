package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40827 {
    private final Productionnull_40827 production = new Productionnull_40827("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}