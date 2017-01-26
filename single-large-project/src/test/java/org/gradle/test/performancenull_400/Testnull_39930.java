package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39930 {
    private final Productionnull_39930 production = new Productionnull_39930("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}