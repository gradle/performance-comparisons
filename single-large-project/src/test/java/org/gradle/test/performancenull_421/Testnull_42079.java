package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42079 {
    private final Productionnull_42079 production = new Productionnull_42079("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}