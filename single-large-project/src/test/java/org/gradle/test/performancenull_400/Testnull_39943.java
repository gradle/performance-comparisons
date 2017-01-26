package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39943 {
    private final Productionnull_39943 production = new Productionnull_39943("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}