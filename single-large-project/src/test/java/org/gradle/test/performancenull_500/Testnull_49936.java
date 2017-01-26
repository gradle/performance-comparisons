package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49936 {
    private final Productionnull_49936 production = new Productionnull_49936("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}