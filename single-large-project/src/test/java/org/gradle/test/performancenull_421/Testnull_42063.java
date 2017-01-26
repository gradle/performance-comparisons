package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42063 {
    private final Productionnull_42063 production = new Productionnull_42063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}