package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36942 {
    private final Productionnull_36942 production = new Productionnull_36942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}