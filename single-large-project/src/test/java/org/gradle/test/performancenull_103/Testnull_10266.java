package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10266 {
    private final Productionnull_10266 production = new Productionnull_10266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}