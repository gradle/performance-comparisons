package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1803 {
    private final Productionnull_1803 production = new Productionnull_1803("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}