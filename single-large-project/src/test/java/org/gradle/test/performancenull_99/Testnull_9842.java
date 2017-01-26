package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9842 {
    private final Productionnull_9842 production = new Productionnull_9842("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}