package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36964 {
    private final Productionnull_36964 production = new Productionnull_36964("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}