package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36962 {
    private final Productionnull_36962 production = new Productionnull_36962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}