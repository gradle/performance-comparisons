package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14933 {
    private final Productionnull_14933 production = new Productionnull_14933("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}