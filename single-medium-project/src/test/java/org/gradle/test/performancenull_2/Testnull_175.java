package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_175 {
    private final Productionnull_175 production = new Productionnull_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}