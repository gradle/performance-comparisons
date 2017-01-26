package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25953 {
    private final Productionnull_25953 production = new Productionnull_25953("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}