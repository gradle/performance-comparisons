package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25919 {
    private final Productionnull_25919 production = new Productionnull_25919("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}