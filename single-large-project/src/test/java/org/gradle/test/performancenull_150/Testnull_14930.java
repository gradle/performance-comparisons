package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14930 {
    private final Productionnull_14930 production = new Productionnull_14930("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}