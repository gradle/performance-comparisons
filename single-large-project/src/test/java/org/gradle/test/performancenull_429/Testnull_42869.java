package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42869 {
    private final Productionnull_42869 production = new Productionnull_42869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}