package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8003 {
    private final Productionnull_8003 production = new Productionnull_8003("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}