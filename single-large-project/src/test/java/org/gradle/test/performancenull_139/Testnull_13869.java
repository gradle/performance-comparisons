package org.gradle.test.performancenull_139;

import static org.junit.Assert.*;

public class Testnull_13869 {
    private final Productionnull_13869 production = new Productionnull_13869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}