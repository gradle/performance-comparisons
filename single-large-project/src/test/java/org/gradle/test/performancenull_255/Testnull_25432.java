package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25432 {
    private final Productionnull_25432 production = new Productionnull_25432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}