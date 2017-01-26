package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38560 {
    private final Productionnull_38560 production = new Productionnull_38560("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}