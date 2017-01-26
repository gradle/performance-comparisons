package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11903 {
    private final Productionnull_11903 production = new Productionnull_11903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}