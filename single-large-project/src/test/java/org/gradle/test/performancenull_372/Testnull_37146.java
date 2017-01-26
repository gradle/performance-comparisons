package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37146 {
    private final Productionnull_37146 production = new Productionnull_37146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}