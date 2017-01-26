package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36926 {
    private final Productionnull_36926 production = new Productionnull_36926("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}