package org.gradle.test.performancenull_162;

import static org.junit.Assert.*;

public class Testnull_16150 {
    private final Productionnull_16150 production = new Productionnull_16150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}