package org.gradle.test.performancenull_169;

import static org.junit.Assert.*;

public class Testnull_16873 {
    private final Productionnull_16873 production = new Productionnull_16873("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}