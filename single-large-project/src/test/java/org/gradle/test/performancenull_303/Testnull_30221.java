package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30221 {
    private final Productionnull_30221 production = new Productionnull_30221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}