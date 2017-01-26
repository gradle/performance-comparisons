package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27483 {
    private final Productionnull_27483 production = new Productionnull_27483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}