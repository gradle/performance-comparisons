package org.gradle.test.performancenull_140;

import static org.junit.Assert.*;

public class Testnull_13996 {
    private final Productionnull_13996 production = new Productionnull_13996("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}