package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7198 {
    private final Productionnull_7198 production = new Productionnull_7198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}