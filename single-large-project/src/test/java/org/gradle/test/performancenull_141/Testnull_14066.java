package org.gradle.test.performancenull_141;

import static org.junit.Assert.*;

public class Testnull_14066 {
    private final Productionnull_14066 production = new Productionnull_14066("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}