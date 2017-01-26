package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5996 {
    private final Productionnull_5996 production = new Productionnull_5996("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}