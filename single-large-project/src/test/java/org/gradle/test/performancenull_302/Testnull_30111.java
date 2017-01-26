package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30111 {
    private final Productionnull_30111 production = new Productionnull_30111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}