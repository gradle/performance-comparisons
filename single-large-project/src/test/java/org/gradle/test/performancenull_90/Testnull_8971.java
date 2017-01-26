package org.gradle.test.performancenull_90;

import static org.junit.Assert.*;

public class Testnull_8971 {
    private final Productionnull_8971 production = new Productionnull_8971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}