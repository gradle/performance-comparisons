package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31956 {
    private final Productionnull_31956 production = new Productionnull_31956("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}