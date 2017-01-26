package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40125 {
    private final Productionnull_40125 production = new Productionnull_40125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}