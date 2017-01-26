package org.gradle.test.performancenull_184;

import static org.junit.Assert.*;

public class Testnull_18373 {
    private final Productionnull_18373 production = new Productionnull_18373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}