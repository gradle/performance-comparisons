package org.gradle.test.performancenull_191;

import static org.junit.Assert.*;

public class Testnull_19042 {
    private final Productionnull_19042 production = new Productionnull_19042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}