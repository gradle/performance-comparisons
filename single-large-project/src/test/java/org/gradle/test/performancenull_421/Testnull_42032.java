package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42032 {
    private final Productionnull_42032 production = new Productionnull_42032("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}