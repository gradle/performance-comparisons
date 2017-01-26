package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2978 {
    private final Productionnull_2978 production = new Productionnull_2978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}