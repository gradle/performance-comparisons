package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10270 {
    private final Productionnull_10270 production = new Productionnull_10270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}