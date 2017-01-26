package org.gradle.test.performancenull_327;

import static org.junit.Assert.*;

public class Testnull_32609 {
    private final Productionnull_32609 production = new Productionnull_32609("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}