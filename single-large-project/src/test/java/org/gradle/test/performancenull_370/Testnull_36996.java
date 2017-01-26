package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36996 {
    private final Productionnull_36996 production = new Productionnull_36996("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}