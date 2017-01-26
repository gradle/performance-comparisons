package org.gradle.test.performancenull_111;

import static org.junit.Assert.*;

public class Testnull_11079 {
    private final Productionnull_11079 production = new Productionnull_11079("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}