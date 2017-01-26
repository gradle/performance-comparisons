package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3181 {
    private final Productionnull_3181 production = new Productionnull_3181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}