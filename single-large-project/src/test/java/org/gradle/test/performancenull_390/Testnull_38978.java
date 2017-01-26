package org.gradle.test.performancenull_390;

import static org.junit.Assert.*;

public class Testnull_38978 {
    private final Productionnull_38978 production = new Productionnull_38978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}