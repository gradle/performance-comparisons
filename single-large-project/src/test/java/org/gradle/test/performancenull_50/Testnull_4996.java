package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4996 {
    private final Productionnull_4996 production = new Productionnull_4996("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}