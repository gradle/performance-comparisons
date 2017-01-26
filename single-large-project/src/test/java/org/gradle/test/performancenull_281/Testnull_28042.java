package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28042 {
    private final Productionnull_28042 production = new Productionnull_28042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}