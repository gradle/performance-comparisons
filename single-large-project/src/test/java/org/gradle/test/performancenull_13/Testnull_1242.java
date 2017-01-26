package org.gradle.test.performancenull_13;

import static org.junit.Assert.*;

public class Testnull_1242 {
    private final Productionnull_1242 production = new Productionnull_1242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}