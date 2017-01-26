package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25955 {
    private final Productionnull_25955 production = new Productionnull_25955("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}