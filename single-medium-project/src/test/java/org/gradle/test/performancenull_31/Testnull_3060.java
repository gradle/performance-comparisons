package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3060 {
    private final Productionnull_3060 production = new Productionnull_3060("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}