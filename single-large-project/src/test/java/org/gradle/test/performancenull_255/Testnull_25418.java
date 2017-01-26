package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25418 {
    private final Productionnull_25418 production = new Productionnull_25418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}