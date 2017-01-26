package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17953 {
    private final Productionnull_17953 production = new Productionnull_17953("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}