package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22962 {
    private final Productionnull_22962 production = new Productionnull_22962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}