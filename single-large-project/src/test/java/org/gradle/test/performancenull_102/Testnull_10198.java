package org.gradle.test.performancenull_102;

import static org.junit.Assert.*;

public class Testnull_10198 {
    private final Productionnull_10198 production = new Productionnull_10198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}