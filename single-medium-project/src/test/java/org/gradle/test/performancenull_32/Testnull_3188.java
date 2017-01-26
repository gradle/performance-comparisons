package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3188 {
    private final Productionnull_3188 production = new Productionnull_3188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}