package org.gradle.test.performancenull_162;

import static org.junit.Assert.*;

public class Testnull_16101 {
    private final Productionnull_16101 production = new Productionnull_16101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}