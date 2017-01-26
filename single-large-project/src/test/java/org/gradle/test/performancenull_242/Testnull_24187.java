package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24187 {
    private final Productionnull_24187 production = new Productionnull_24187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}