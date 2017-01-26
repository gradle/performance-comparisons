package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25468 {
    private final Productionnull_25468 production = new Productionnull_25468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}