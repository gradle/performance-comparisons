package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4106 {
    private final Productionnull_4106 production = new Productionnull_4106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}