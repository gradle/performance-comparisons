package org.gradle.test.performancenull_499;

import static org.junit.Assert.*;

public class Testnull_49873 {
    private final Productionnull_49873 production = new Productionnull_49873("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}