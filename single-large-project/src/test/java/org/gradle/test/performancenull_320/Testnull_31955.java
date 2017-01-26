package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31955 {
    private final Productionnull_31955 production = new Productionnull_31955("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}