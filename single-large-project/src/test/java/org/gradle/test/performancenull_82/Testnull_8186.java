package org.gradle.test.performancenull_82;

import static org.junit.Assert.*;

public class Testnull_8186 {
    private final Productionnull_8186 production = new Productionnull_8186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}