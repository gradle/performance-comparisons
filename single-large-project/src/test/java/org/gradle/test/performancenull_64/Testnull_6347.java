package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6347 {
    private final Productionnull_6347 production = new Productionnull_6347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}