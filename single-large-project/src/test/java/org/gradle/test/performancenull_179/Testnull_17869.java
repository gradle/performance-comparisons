package org.gradle.test.performancenull_179;

import static org.junit.Assert.*;

public class Testnull_17869 {
    private final Productionnull_17869 production = new Productionnull_17869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}