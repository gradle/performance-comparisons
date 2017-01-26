package org.gradle.test.performancenull_399;

import static org.junit.Assert.*;

public class Testnull_39869 {
    private final Productionnull_39869 production = new Productionnull_39869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}