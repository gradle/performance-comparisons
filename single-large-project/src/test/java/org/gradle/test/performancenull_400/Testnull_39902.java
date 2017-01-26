package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39902 {
    private final Productionnull_39902 production = new Productionnull_39902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}