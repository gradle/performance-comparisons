package org.gradle.test.performancenull_328;

import static org.junit.Assert.*;

public class Testnull_32746 {
    private final Productionnull_32746 production = new Productionnull_32746("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}