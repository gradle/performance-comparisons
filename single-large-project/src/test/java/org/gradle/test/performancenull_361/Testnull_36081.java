package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36081 {
    private final Productionnull_36081 production = new Productionnull_36081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}