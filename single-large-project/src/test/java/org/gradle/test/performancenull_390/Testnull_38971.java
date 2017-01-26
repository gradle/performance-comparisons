package org.gradle.test.performancenull_390;

import static org.junit.Assert.*;

public class Testnull_38971 {
    private final Productionnull_38971 production = new Productionnull_38971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}