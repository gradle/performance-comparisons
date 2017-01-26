package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3119 {
    private final Productionnull_3119 production = new Productionnull_3119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}