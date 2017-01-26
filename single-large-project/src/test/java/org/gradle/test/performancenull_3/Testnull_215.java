package org.gradle.test.performancenull_3;

import static org.junit.Assert.*;

public class Testnull_215 {
    private final Productionnull_215 production = new Productionnull_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}