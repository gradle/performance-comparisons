package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20258 {
    private final Productionnull_20258 production = new Productionnull_20258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}