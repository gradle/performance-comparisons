package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1942 {
    private final Productionnull_1942 production = new Productionnull_1942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}