package org.gradle.test.performancenull_384;

import static org.junit.Assert.*;

public class Testnull_38378 {
    private final Productionnull_38378 production = new Productionnull_38378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}