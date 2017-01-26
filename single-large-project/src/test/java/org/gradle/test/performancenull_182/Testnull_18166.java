package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18166 {
    private final Productionnull_18166 production = new Productionnull_18166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}