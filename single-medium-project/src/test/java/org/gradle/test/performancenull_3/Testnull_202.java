package org.gradle.test.performancenull_3;

import static org.junit.Assert.*;

public class Testnull_202 {
    private final Productionnull_202 production = new Productionnull_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}