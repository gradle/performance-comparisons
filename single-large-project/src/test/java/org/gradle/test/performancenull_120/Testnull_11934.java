package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11934 {
    private final Productionnull_11934 production = new Productionnull_11934("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}