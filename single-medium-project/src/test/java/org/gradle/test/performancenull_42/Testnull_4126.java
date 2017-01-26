package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4126 {
    private final Productionnull_4126 production = new Productionnull_4126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}