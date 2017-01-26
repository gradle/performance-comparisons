package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21506 {
    private final Productionnull_21506 production = new Productionnull_21506("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}