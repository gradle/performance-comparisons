package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20281 {
    private final Productionnull_20281 production = new Productionnull_20281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}