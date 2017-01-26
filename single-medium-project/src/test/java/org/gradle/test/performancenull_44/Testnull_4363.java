package org.gradle.test.performancenull_44;

import static org.junit.Assert.*;

public class Testnull_4363 {
    private final Productionnull_4363 production = new Productionnull_4363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}