package org.gradle.test.performancenull_238;

import static org.junit.Assert.*;

public class Testnull_23703 {
    private final Productionnull_23703 production = new Productionnull_23703("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}