package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20586 {
    private final Productionnull_20586 production = new Productionnull_20586("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}