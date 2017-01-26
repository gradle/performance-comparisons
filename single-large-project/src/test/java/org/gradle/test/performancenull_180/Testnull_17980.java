package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17980 {
    private final Productionnull_17980 production = new Productionnull_17980("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}