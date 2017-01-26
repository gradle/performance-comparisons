package org.gradle.test.performancenull_359;

import static org.junit.Assert.*;

public class Testnull_35873 {
    private final Productionnull_35873 production = new Productionnull_35873("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}