package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4170 {
    private final Productionnull_4170 production = new Productionnull_4170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}