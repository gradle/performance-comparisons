package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25929 {
    private final Productionnull_25929 production = new Productionnull_25929("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}