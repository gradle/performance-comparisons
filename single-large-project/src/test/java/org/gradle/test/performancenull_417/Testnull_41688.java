package org.gradle.test.performancenull_417;

import static org.junit.Assert.*;

public class Testnull_41688 {
    private final Productionnull_41688 production = new Productionnull_41688("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}