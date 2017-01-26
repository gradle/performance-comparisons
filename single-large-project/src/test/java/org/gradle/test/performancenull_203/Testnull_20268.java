package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20268 {
    private final Productionnull_20268 production = new Productionnull_20268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}