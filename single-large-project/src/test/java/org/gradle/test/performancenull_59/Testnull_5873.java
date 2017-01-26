package org.gradle.test.performancenull_59;

import static org.junit.Assert.*;

public class Testnull_5873 {
    private final Productionnull_5873 production = new Productionnull_5873("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}