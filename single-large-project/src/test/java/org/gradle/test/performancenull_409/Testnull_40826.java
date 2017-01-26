package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40826 {
    private final Productionnull_40826 production = new Productionnull_40826("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}