package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11981 {
    private final Productionnull_11981 production = new Productionnull_11981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}