package org.gradle.test.performancenull_480;

import static org.junit.Assert.*;

public class Testnull_47919 {
    private final Productionnull_47919 production = new Productionnull_47919("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}