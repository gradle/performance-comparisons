package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7187 {
    private final Productionnull_7187 production = new Productionnull_7187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}