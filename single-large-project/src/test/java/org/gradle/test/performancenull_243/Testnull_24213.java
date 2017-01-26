package org.gradle.test.performancenull_243;

import static org.junit.Assert.*;

public class Testnull_24213 {
    private final Productionnull_24213 production = new Productionnull_24213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}