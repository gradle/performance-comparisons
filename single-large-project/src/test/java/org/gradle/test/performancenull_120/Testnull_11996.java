package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11996 {
    private final Productionnull_11996 production = new Productionnull_11996("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}