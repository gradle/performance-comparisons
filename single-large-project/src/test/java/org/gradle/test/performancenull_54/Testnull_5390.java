package org.gradle.test.performancenull_54;

import static org.junit.Assert.*;

public class Testnull_5390 {
    private final Productionnull_5390 production = new Productionnull_5390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}