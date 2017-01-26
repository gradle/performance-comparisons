package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31953 {
    private final Productionnull_31953 production = new Productionnull_31953("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}