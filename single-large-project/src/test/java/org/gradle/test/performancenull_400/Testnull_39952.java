package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39952 {
    private final Productionnull_39952 production = new Productionnull_39952("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}