package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20079 {
    private final Productionnull_20079 production = new Productionnull_20079("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}