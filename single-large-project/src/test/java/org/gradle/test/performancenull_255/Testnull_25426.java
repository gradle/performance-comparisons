package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25426 {
    private final Productionnull_25426 production = new Productionnull_25426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}