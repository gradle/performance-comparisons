package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21841 {
    private final Productionnull_21841 production = new Productionnull_21841("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}