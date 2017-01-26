package org.gradle.test.performancenull_62;

import static org.junit.Assert.*;

public class Testnull_6185 {
    private final Productionnull_6185 production = new Productionnull_6185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}