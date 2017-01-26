package org.gradle.test.performancenull_1;

import static org.junit.Assert.*;

public class Testnull_25 {
    private final Productionnull_25 production = new Productionnull_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}