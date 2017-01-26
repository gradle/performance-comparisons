package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32091 {
    private final Productionnull_32091 production = new Productionnull_32091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}