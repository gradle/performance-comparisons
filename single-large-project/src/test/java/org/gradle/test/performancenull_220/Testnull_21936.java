package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21936 {
    private final Productionnull_21936 production = new Productionnull_21936("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}