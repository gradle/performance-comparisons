package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30213 {
    private final Productionnull_30213 production = new Productionnull_30213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}