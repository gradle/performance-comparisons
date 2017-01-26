package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39963 {
    private final Productionnull_39963 production = new Productionnull_39963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}