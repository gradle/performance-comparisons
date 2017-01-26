package org.gradle.test.performancenull_159;

import static org.junit.Assert.*;

public class Testnull_15869 {
    private final Productionnull_15869 production = new Productionnull_15869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}