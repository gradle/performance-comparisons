package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1996 {
    private final Productionnull_1996 production = new Productionnull_1996("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}