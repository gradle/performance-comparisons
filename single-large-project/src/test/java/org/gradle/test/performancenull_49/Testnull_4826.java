package org.gradle.test.performancenull_49;

import static org.junit.Assert.*;

public class Testnull_4826 {
    private final Productionnull_4826 production = new Productionnull_4826("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}