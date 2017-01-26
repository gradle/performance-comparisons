package org.gradle.test.performancenull_102;

import static org.junit.Assert.*;

public class Testnull_10187 {
    private final Productionnull_10187 production = new Productionnull_10187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}