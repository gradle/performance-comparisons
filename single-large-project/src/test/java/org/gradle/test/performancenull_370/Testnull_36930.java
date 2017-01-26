package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36930 {
    private final Productionnull_36930 production = new Productionnull_36930("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}