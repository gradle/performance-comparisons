package org.gradle.test.performancenull_222;

import static org.junit.Assert.*;

public class Testnull_22129 {
    private final Productionnull_22129 production = new Productionnull_22129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}