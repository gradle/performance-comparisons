package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3157 {
    private final Productionnull_3157 production = new Productionnull_3157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}