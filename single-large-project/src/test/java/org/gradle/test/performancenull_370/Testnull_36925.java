package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36925 {
    private final Productionnull_36925 production = new Productionnull_36925("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}