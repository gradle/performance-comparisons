package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1755 {
    private final Productionnull_1755 production = new Productionnull_1755("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}