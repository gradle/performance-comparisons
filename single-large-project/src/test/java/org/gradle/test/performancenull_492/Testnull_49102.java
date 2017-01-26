package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49102 {
    private final Productionnull_49102 production = new Productionnull_49102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}