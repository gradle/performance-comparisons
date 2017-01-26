package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23978 {
    private final Productionnull_23978 production = new Productionnull_23978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}